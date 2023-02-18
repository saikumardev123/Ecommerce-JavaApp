package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.User;
import com.ecommerce.service.UserService;
import com.ecommerce.util.Response;

@RequestMapping("/user")
@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@CrossOrigin
	@PostMapping("/register")
	 public ResponseEntity<Response> register(@RequestBody User user) {
		  System.out.println("username"+ user.getUsername());
		        Response response=  userService.register(user);
		         if(response.getOperation() == true) {
		        	 return new ResponseEntity<Response>(response,HttpStatus.OK);
		         }
		         else {
		        	 return new ResponseEntity<Response>(response,HttpStatus.BAD_REQUEST);
		         }
	 }
}
