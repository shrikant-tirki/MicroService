package com.bel.training.jwt.model;

import java.util.List;
//represents the response you get back after log in. 
//It includes authentication token & role used for
public class AuthResponse {

	private String token;
	private List<String> roles;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public AuthResponse(String token, List<String> roles) {
		super();
		this.token = token;
		this.roles = roles;
	}
	public AuthResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
