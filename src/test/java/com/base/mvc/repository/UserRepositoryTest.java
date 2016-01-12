package com.base.mvc.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.base.config.RootApplicationConfig;
import com.base.mvc.data.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootApplicationConfig.class)
public class UserRepositoryTest {

	private static Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);
	
	private @Autowired UserRepository userRepository;
	
	@Test
	@Transactional
	public void insertUserTest(){
		User user = new User();
		user.setName("Toon");
		Long userId = userRepository.insertUser(user);
		
		User getUser = userRepository.selectUser(userId);
		logger.info(getUser.toString());
	}
	
	@Test
	public void selectUserTest(){
		List<User> userList = userRepository.selectUser();
		Assert.assertNotNull(userList);
		for(User user : userList){
			logger.info(user.toString());
		}
	}
	
}
