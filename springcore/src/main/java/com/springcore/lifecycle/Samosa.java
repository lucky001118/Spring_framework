package com.springcore.lifecycle;

public class Samosa {
	private String type;
	private int price;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public void init() {
		System.out.println("Inside the init() mathod.");
	}
	
	public void destroy() {
		System.out.println("Inside the destroy method");
	}
	@Override
	public String toString() {
		return "Samosa [type=" + type + ", price=" + price + "]";
	}
	
}
