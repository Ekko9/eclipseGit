package com.spring;

public class Boy {
	
	Integer bid;
	String bname;
	String gender;
	
	public Boy(Integer bid, String bname, String gender) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.gender = gender;
	}
	
	public Boy(String bname, String gender) {
		super();
		this.bname = bname;
		this.gender = gender;
	}

	public void di() {
		System.out.println("Hello");
		System.out.println("有参构造：id:" + bid + ";name:" + bname + ";gender:" + gender);
	}
}
