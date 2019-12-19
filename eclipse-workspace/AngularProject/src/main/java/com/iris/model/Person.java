package com.iris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person_table")
public class Person {

	@Id
	@Column(name="Person_Id")
	private int personId;
	
	@Column(name="Person_Name")
	private String personName;
	
	@Column(name="Person_Age")
	private int personAge;
	
	@Column(name="Person_Mobile")
	private long personMobile;
	
	@Column(name="Person_Email")
	private String personEmail;
	
	@Column(name="Person_Password")
	private String password;
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public long getPersonMobile() {
		return personMobile;
	}
	public void setPersonMobile(long personMobile) {
		this.personMobile = personMobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPersonEmail() {
		return personEmail;
	}
	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}
	

}
