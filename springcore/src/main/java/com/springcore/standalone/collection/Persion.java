package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
//import java.util.jar.Attributes.Name;

public class Persion {
	public Persion() {
		super();
		// TODO Auto-generated constructor stub
	}
	private List<String> name;
	private List<String> mobile;
	private Map<String, String> course;
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public List<String> getMobile() {
		return mobile;
	}
	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Persion(List<String> name, List<String> mobile, Map<String, String> course) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Persion [name=" + name + ", mobile=" + mobile + ", course=" + course + "]";
	}

}
