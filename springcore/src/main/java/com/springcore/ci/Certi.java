package com.springcore.ci;

public class Certi {
	String name ;
	String by;
	
	public Certi(String name,String by) {
		this.name = name;
		this.by=by;
	}

	@Override
	public String toString() {
		return this.name+" and "+this.by;
	}
}
