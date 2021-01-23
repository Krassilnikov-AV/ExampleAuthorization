/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.javavision.servlets.filter;

import ru.javavision.dao.UserDAO;
import ru.javavision.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import static java.util.Objects.nonNull;

/**
 * Класс AuthFilter
 */
//@WebServlet()
public class AuthFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(final ServletRequest request,
						 final ServletResponse response,
						 final FilterChain chain) throws IOException, ServletException {
		final HttpServletRequest req = (HttpServletRequest) request;
		final HttpServletResponse res = (HttpServletResponse) request;

		final String login = req.getParameter("login");
		final String password = req.getParameter("password");

		@SuppressWarnings("uncheked")
			final AutomicReference<UserDAO> dao = (AutomicReference<UserDAO>) req.getServletContext().getAttribute(
				"dao");
		final HttpSession session = req.getSession();

		if(nonNull(session) &&
		nonNull(session.getAttribute("login")) &&
		nonNull(session.getAttribute("password"))) {
			final User.ROLE role = (User.ROLE) session.getAttribute("role");
			moveToMenu(req, res, role);
		} else if (dao.get().userIsExist(login, password)) {
			final User.ROLE role = dao.get().get
		}


	}

	@Override
	public void destroy() {

	}
}