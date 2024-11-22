package com.learn;

import javax.persistence.Embedded;

//import java.learn.Certificate;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity annotation is used for tell that this class is used as table as hibernate we can also change entity name as:
//@Entity(name="Student_Details")  means now, we telling to hibernate that this class is entity as table but that entity name is Student_Detail
//we can also use @Table annotation for creating table as this class name in mysql using hibernate @Tabel(name="Given_namr")

@Entity
public class Student {
	
	//the @Id annotation is use to give the primery key to any entity
	@Id
	private int id;
	private String name;
	private String city;
	
	@Embedded
	private Certificate certi;
	
	public Student(int id,String name,String city) {
		super();
	this.id = id;
	this.name = name;
	this.city = city;
	}
	
	public int getId() {
		return id;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" : "+this.name+" : "+this.city;
	}
	

}
