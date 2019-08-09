package com.uid.model;

import java.io.Serializable;

public class Report implements Comparable<Report>, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int enroll_id;
	private String name;
	private long CONTACT_NO;
	private String look;

	public int getEnroll_id() {
		return enroll_id;
	}

	public void setEnroll_id(int enroll_id) {
		this.enroll_id = enroll_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCONTACT_NO() {
		return CONTACT_NO;
	}

	public void setCONTACT_NO(long CONTACT_NO) {
		this.CONTACT_NO = CONTACT_NO;
	}

	public String getLook() {
		return look;
	}

	public void setLook(String look) {
		this.look = look;
	}

	public Report() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Report o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
