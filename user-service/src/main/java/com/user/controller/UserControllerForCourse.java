package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.UserService;

@RestController
public class UserControllerForCourse {
	@Autowired
	private UserService userService;

	@GetMapping("/getUsersList")
	public List<User> getUsersList() {
		List<User> userList = userService.getUsers();
		return userList;
	}
}
