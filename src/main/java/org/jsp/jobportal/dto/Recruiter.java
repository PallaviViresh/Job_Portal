package org.jsp.jobportal.dto;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Recruiter {
	@Id
    int id;
	String fullname;
	String email;
	long mobile;
	String password;
	String gender;
	String companyname;
	String companylocation;
	
}
