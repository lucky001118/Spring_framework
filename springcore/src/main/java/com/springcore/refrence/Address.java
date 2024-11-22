package com.springcore.refrence;

public class Address {
	private String city;
	private String wardNo;
	private String pinCode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getWardNo() {
		return wardNo;
	}

	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String wardNo, String pinCode) {
		super();
		this.city = city;
		this.wardNo = wardNo;
		this.pinCode = pinCode;
	}

}
