package com.base.mvc.data.mapper;

import com.base.mvc.data.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setUserId(resultSet.getLong("user_id"));
        user.setName(resultSet.getString("name"));
        user.setCreateDate(resultSet.getDate("create_date"));
        return user;
    }
}
