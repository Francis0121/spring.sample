package com.base.mvc.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.base.mvc.data.entity.User;
import com.base.mvc.data.mapper.UserMapper;
import com.base.mvc.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository{

	private static Logger logger = LoggerFactory.getLogger(UserRepository.class);

	private @Autowired JdbcTemplate jdbcTemplate;

	@Override
	public List<User> selectUser() {
		String query = "SELECT user_id, name, create_date FROM USER";
		List<User> userList = jdbcTemplate.query(query, new Object[] {}, new UserMapper());
		return userList;
	}

	@Override
	public Long insertUser(final User user) {
		final String query = "INSERT INTO user ( name, create_date ) VALUES ( ?, now() ) ";
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(
		    new PreparedStatementCreator(){
		        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
		            PreparedStatement ps =
		                connection.prepareStatement(query, new String[] {"user_id"});
		            ps.setString(1, user.getName());
		            return ps;
		        }
		    },
		    keyHolder);
		Number userId = keyHolder.getKey();
		return userId.longValue();
	}

	@Override
	public User selectUser(Long userId) {
		String query = "SELECT user_id, name, create_date FROM USER WHERE user_id = ? ";
		User user = jdbcTemplate.queryForObject(query, new Object[] { userId }, new UserMapper());
		return user;
	}
}
