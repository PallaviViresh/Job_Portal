package org.jsp.jobportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
  @Controller
@RequestMapping("/recruiter")
public class RecruiterController {
  
    @GetMapping("/login")
	public String loadLogin() {
		return "RecriuterLogin";
	}
}

