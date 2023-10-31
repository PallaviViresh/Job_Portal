package org.jsp.jobportal.controller;

import org.jsp.jobportal.dto.User;
import org.jsp.jobportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	 @GetMapping("/login")
		public String loadLogin() {
			return "UserLogin";
		}
	   
	   @GetMapping("/signup")
	   public String loadSignup() {
	   	return "UserSignup";
	   }
	   
	   @PostMapping("/signup")
	   public User Signup(User user) {
			return userService.Signup(user);
	   	
	   }
	}

