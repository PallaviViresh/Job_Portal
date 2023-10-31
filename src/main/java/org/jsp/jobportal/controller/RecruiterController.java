package org.jsp.jobportal.controller;

import org.jsp.jobportal.dto.Recruiter;
import org.jsp.jobportal.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
  @Controller
@RequestMapping("/recruiter")
  
 
public class RecruiterController {
	  
	  @Autowired
	  RecruiterService recruiterService;
  
    @GetMapping("/login")
	public String loadLogin() {
		return "RecriuterLogin";
	}
    
    @GetMapping("/signup")
    public String loadSignup() {
    	return "RecruiterSignup";
    }
  
//    @PostMapping("/signup")
//    public String Signup(Recruiter recruiter) {
//		return recruiterService.Signup(recruiter);
//    	
//    }
  }

