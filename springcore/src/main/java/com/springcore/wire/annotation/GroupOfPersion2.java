package com.springcore.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GroupOfPersion2 {

	@Autowired
	@Qualifier("persi")
	private Persion persion;

	public Persion getPersion() {
		return persion;
	}

	
	public void setPersion(Persion persion) {
		this.persion = persion;
	}

	
	public GroupOfPersion2(Persion persion) {
		super();
		this.persion = persion;
	}

	@Override
	public String toString() {
		return "GroupOfPersion [persion=" + this.persion + "]";
	}

	public GroupOfPersion2() {
		super();
		// TODO Auto-generated constructor stub
	}
}
