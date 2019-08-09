package com.uid.dao;

import com.uid.exception.DaoException;
import com.uid.model.Admin;
import com.uid.model.Enroll;

public interface UIDDao {
	
	public Object Enrollment(Enroll enroll)throws DaoException;
	public Object listOfUIDs() throws DaoException;
	public Object Administration(Admin admin)throws DaoException;
	public Object ViewReport()throws DaoException;
	public int generateUID() throws DaoException;

}
