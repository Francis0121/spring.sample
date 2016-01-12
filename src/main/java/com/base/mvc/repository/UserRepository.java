package com.base.mvc.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.base.mvc.data.entity.User;
import com.base.mvc.data.mapper.UserMapper;

@Repository
public class UserRepository {

	private static Logger logger = LoggerFactory.getLogger(UserRepository.class);

	private @Autowired @Qualifier(value = "jdbcTemplate") JdbcTemplate jdbcTemplate;

	public void selectUser() {

		String query = "SELECT user_id, name, create_date FROM USER";

		User user = jdbcTemplate.queryForObject(query, new Object[] {}, new UserMapper());
		logger.info(user.toString());
	}
}
