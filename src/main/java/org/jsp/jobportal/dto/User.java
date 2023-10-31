package org.jsp.jobportal.dto;

import java.time.LocalDate;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class User {
	
    int id;
	String fullname;
	String email;
	long mobile;
	String password;
	String gender;
	LocalDate dob;
	String highestdegree;
	double percentage;
	byte[] resume;
	
}
