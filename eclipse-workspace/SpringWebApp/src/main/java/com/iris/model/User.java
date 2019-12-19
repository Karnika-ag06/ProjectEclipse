package com.iris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="User_14N")
public class User {
	
	@Id
	@Column(name="User_ID")
	@NotNull(message="User Id is required")
	@Min(value=1)
	private Integer userId;
	
	@Column(name="User_Name")
	@NotEmpty(message="User Name is required.")
	@Size(min=3,message="Username should be minium 3 letters")
	private String userName;
	
	@NotEmpty
	@Size(min=7,max=12,message="Password should be between 7 to 12 characters")
	@Column(name="User_Pass")
	private String password;
	
	@NotEmpty
	@Column(name="User_Gender")
	private String gender;
	
	@NotEmpty
	@Column(name="User_Role")
	private String role;	
	
	//@Past
	//@Future
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", gender=" + gender
				+ ", role=" + role + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}