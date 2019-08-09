package com.uid.model;

import java.io.Serializable;

public class Enroll implements Comparable<Enroll>, Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private long CONTACT_NO;
	private String look;
	
	
	

	public Enroll(String name, int CONTACT_NO, String look) {
		super();
		this.name = name;
		this.CONTACT_NO = CONTACT_NO;
		this.look = look;
	}


	public Enroll() {
		super();
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




	@Override
	public String toString() {
		return "Enroll [name=" + name + ", CONTACT_NO=" + CONTACT_NO + ", look="
				+ look + "]";
	}


	@Override
	public int compareTo(Enroll o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
