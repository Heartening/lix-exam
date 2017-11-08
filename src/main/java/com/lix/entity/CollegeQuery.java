package com.lix.entity;

public class CollegeQuery extends Page {
	private College college;
	
	public CollegeQuery() {
		this(new College());
	}
	public CollegeQuery(College college) {
		this.college = college;
	}

	public Integer getCollegeid() {
		return college.getCollegeid();
	}

	
	public void setCollegeid(Integer collegeid) {
		college.setCollegeid(collegeid);
	}

	
	public String getCollegename() {
		return college.getCollegename();
	}

	
	public void setCollegename(String collegename) {
		college.setCollegename(collegename);
	}	
}
