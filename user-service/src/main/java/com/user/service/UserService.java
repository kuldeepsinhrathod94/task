package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserDao;
import com.user.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public List<User> getUsers(){
		return userDao.findAll();
	}
	
	public void addUpdateUser(User user) {
		userDao.save(user);
	}
	
	public void deleteUser(User user) {
		userDao.delete(user);
	}
	public User getUser(int userId) {
		Optional<User> optional= userDao.findById(userId);
		return optional.get();
	}
}
