package com.global.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.Entity.User;
import com.global.Repositary.UserRepos;

@Service
public class UserService {

	@Autowired
	private UserRepos userRepos;
	
	
	public void addUser(User u) {
		
		userRepos.save(u);
	}
}
