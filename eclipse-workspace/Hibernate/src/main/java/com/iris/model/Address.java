package com.iris.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Override
	public String toString() {
		return "Address [house_no=" + house_no + ", street=" + street + ", pinCode=" + pinCode + "]";
	}

	public int getHouse_no() {
		return house_no;
	}

	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Column(name="House_No",nullable=true)
	private int house_no;

	@Column(name="Street_Name",nullable=true)
	private String street;

	@Column(name="PinCode",nullable=true)
	private int pinCode;
	
	public Address() {
		
	}
public Address(int house_no,String street,int pinCode) {
	super();
	this.house_no = house_no;
	this.street = street;
	this.pinCode = pinCode;
	
		
	}
	
	
}
