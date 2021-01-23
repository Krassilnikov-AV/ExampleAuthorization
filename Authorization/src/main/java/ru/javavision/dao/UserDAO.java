/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.javavision.dao;

import ru.javavision.model.User_Name_Age;

import java.util.*;

/**
 * Класс UserDAO
 */
public class UserDAO {
	private final List<User_Name_Age> store = new ArrayList<>();

	public User_Name_Age getById(int id) {
		User_Name_Age result = new User_Name_Age();
		result.setId(-1);
	}
}