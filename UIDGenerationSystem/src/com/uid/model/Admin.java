package com.uid.model;

import java.io.Serializable;

public class Admin implements Comparable<Admin>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int uid;
	private String action;
	
	
	
	@Override
	public String toString() {
		return "Admin [uid=" + uid + ", action=" + action + "]";
	}



	public Admin(int uid, String action) {
		super();
		this.uid = uid;
		this.action = action;
	}



	public Admin() {
		super();
	}



	public int getUid() {
		return uid;
	}



	public void setUid(int uid) {
		this.uid = uid;
	}



	public String getAction() {
		return action;
	}



	public void setAction(String action) {
		this.action = action;
	}



	@Override
	public int compareTo(Admin o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
