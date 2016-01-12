package com.base.mvc.service;

import com.base.mvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private @Autowired UserRepository userRepository;

	public void selectUser() {
        userRepository.selectUser();
	}
}
