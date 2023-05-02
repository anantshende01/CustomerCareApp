package com.ibm.customerCare.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	@Id
	@Column(name="username")
	private int userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "usertype")
	private UserType type;
	
	@Column(name = "isactive")
	private boolean isActive;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}

	public int getUserName() {
		return userName;
	}

	public void setUserName(int userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Login(int userName, String password, UserType type, boolean isActive) {
		super();
		this.userName = userName;
		this.password = password;
		this.type = type;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + ", type=" + type + ", isActive=" + isActive
				+ "]";
	}
	
	
	
}
