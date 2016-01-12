package com.base.mvc;

import com.base.mvc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.base.config.RootApplicationConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootApplicationConfig.class)
public class JdbcConfigTest {

	private static Logger logger = LoggerFactory.getLogger(JdbcConfigTest.class);

	private @Autowired UserService userService;

	@Test
	public void jdbcTest() {
		logger.info("jdbcTest");
        userService.selectUser();
	}
}
