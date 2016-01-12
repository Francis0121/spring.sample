package com.base.mvc.controller;

import com.base.mvc.data.entity.User;
import com.base.mvc.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	private @Autowired UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String getUser(Model model) {
        model.addAttribute("users", userService.selectUser());
        return "users";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getUser(Model model, User user){
		return "user";				
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String postUser(Model model, User user){
		logger.info("Post : {}", user);
		return "user";				
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public String putUse(Model model, User user, BindingResult result){
		logger.info("Put : {}", user);
		return "redirect:/user";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.DELETE)
	public String deleteUser(Model model, User user){
		logger.info("Delete : {}", user);
		return "user";
	}
}
