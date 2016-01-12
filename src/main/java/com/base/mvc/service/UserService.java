package com.base.mvc.service;

import com.base.mvc.data.entity.User;
import com.base.mvc.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private @Autowired UserRepository userRepository;

	public List<User> selectUser() {
        return userRepository.selectUser();
	}
}
