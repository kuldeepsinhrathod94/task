package com.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.entity.User;
import com.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String getUsers(Model model) {
		model.addAttribute("users",userService.getUsers());
		return "index";
	}
	
	@GetMapping("/addUserView")
	public String addUserView(Model model) {
		model.addAttribute("user",new User());
		return "addUser";
	}
	
	@PostMapping("/addUser")
	public String addUser(@ModelAttribute("user") User user, Model model) {
		userService.addUpdateUser(user);
		model.addAttribute("users",userService.getUsers());
		return "index";
	}
	
	@GetMapping("/updateUserPage")
	public String updateUserPage(@RequestParam("userId") int userId, Model model) {
		model.addAttribute("user",userService.getUser(userId));
		return "updateUser";
	}
	
	@PostMapping("/updateUser")
	public String updateUser(@ModelAttribute("user") User user, Model model) {
		userService.addUpdateUser(user);
		model.addAttribute("users",userService.getUsers());
		return "index";
	}
	
	@GetMapping("/deleteUser")
	public String deleteUser(@ModelAttribute("user") User user, Model model) {
		userService.deleteUser(user);
		model.addAttribute("users",userService.getUsers());
		return "index";
	}

}
