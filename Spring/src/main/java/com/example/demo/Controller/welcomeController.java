package com.example.demo.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;


@RestController

public class welcomeController {
	@RequestMapping(value="/welcome")
	public static String welcome() {
		return "Welcome to Spring Boot";
	}
	
	@RequestMapping(value="/users")
	   public User getAllUsers() {
		User user = new User();
		
		user.setId(0); 
		user.setLocation("pune");
		user.setName("Lawrence");
		return user;
			
			

		
	   }	
}
