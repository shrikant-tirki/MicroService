package com.bel.training.jwt.model;

public class SignupRequest {

	private String userName; 
	private String email;
	private String password;
	private String[] roles;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String[] getRoles() {
		return roles;
	}
	public void setRoles(String[] roles) {
		this.roles = roles;
	}
	public SignupRequest(String userName, String email, String password, String[] roles) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	public SignupRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
