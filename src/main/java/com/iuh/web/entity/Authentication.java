package com.iuh.web.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Authentication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String role;
	private boolean enable;
	
	public Authentication() {
		// TODO Auto-generated constructor stub
	}

	public Authentication(int id, String role, boolean enable) {
		super();
		this.id = id;
		this.role = role;
		this.enable = enable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}


	@Override
	public String toString() {
		return "Authentication [id=" + id + ", role=" + role + ", enable=" + enable +"]";
	}

	
}
