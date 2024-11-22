package com.springcore.ci;

import java.util.List;

public class UserStruct {
	private String name;
	private int id;
	private List<String> addresses;
	private List<String> mobileNo;
	private List<Certi> certificate;
	private int certificateNo;
	
	public UserStruct(String name,int id,List<String> addresses,
			List<String> mobileNo,List<Certi> certificate,int certificateNo) {
		this.name = name;
		this.id = id;
		this.addresses = addresses;
		this.mobileNo = mobileNo;
		this.certificate = certificate;
		this.certificateNo = certificateNo;
	}

	@Override
	public String toString() {
		return "UserStruct [name=" + name + ", id=" + id + ", addresses=" + addresses + ", mobileNo=" + mobileNo
				+ ", certificate=" + certificate + ", certificateNo=" + certificateNo + "]";
	}
	

}
