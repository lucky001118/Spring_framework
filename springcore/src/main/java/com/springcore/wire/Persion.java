package com.springcore.wire;

public class Persion {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//constructer
	public Persion(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Persion() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Persion [name=" + name + ", age=" + age + "]";
	}
	
}
