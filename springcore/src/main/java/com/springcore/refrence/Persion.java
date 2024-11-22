package com.springcore.refrence;

public class Persion {

	private String firstName;
	private String lastName;
	private int age;
	private Address fullAddress;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getFullAddress() {
		return fullAddress;
	}

	public Persion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setFullAddress(Address fullAddress) {
		this.fullAddress = fullAddress;
	}

	public Persion(String firstName, String lastName, int age, Address fullAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.fullAddress = fullAddress;
	}

}
