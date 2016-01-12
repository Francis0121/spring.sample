package com.base.mvc.controller;

import com.base.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	private @Autowired UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView getUser() {
        userService.selectUser();
        return new ModelAndView("user");
	}
}
