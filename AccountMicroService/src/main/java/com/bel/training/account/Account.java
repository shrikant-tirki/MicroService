package com.bel.training.account;

public class Account {

	private int empId;
	private String accountId;
	private String branch;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int empId, String accountId, String branch) {
		super();
		this.empId = empId;
		this.accountId = accountId;
		this.branch = branch;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
