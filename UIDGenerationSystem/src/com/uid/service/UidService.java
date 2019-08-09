package com.uid.service;

import com.uid.exception.ServiceException;
import com.uid.model.Admin;
import com.uid.model.Enroll;

public interface UidService {
	

	public Object Enrollment(Enroll enroll)throws ServiceException;
	public Object listOfUIDs() throws ServiceException;
	public Object Administration(Admin admin)throws ServiceException;
	public Object ViewReport()throws ServiceException;

}
