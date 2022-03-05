package com.bel.training.jwt.model;


import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	@Enumerated(EnumType.STRING)
	@Column(name="name")
	private Roles roleName;
	
	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Roles getRoleName() {
		return roleName;
	}
	public void setRoleName(Roles roleName) {
		this.roleName = roleName;
	}
	public Role(Integer id, Roles roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}
	
	
	
}
