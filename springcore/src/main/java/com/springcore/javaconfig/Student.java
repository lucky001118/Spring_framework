package com.springcore.javaconfig;

//import com.springcore.lifecycle.Samosa;

public class Student {
	private Samosa samosa;

	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void study() {
		this.samosa.display();
		System.out.println("student is eating samosa");
	}

}
