package com.springcore.ci;

public class Persion {
	private String name;
	private int persionId;
	private Certi certificate;
	public Persion(String name,int persionId,Certi certificate) {
		this.name = name;
		this.persionId = persionId;		
		this.certificate=certificate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" : "+this.persionId+"{"+this.certificate.name+"}";
	}
	
	

}
