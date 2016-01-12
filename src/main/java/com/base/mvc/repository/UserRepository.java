package com.base.mvc.repository;

import java.util.List;

import com.base.mvc.data.entity.User;

public interface UserRepository {
	
	List<User> selectUser();

	Long insertUser(User user);

	User selectUser(Long userId);

}
