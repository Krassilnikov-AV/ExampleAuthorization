/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.javavision.servlet.filter;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Класс AuthFilter
 */
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

	}

	@Override
	public void destroy() {

	}
}