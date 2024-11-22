package com.springcore.wire;

public class GroupOfPersion {
	private Persion persion;

	public Persion getPersion() {
		return persion;
	}

	public void setPersion(Persion persion) {
		this.persion = persion;
	}

	public GroupOfPersion(Persion persion) {
		super();
		this.persion = persion;
	}

	@Override
	public String toString() {
		return "GroupOfPersion [persion=" + persion + "]";
	}

	public GroupOfPersion() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
