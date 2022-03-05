package com.bel.training.jwt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class UserController {

	@GetMapping("/allusers")
	public String displayUsers() {
		return "Display All Users";
	}
	
	@GetMapping("/displayuser")
	@PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
	public String displayToUser() {
		return "Display to both user and admin";
	}
	
	@GetMapping("/displayadmin")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String displayToAdmin() {
		return "Display only to admin";
	}
	
}
