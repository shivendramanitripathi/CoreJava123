package com.uid.service;

import java.util.List;

import com.uid.exception.DaoException;
import com.uid.exception.ServiceException;
import com.uid.dao.DaoFactory;
import com.uid.dao.UIDDao;
import com.uid.model.Admin;
import com.uid.model.Enroll;

public class UidServiceImpl implements UidService {

	private UIDDao dao;
	DaoFactory service = new DaoFactory();
	
	public UidServiceImpl() throws ServiceException{
		try {
			dao = service.getDao();
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage(),e);
		}
	}
	
	@Override
	public Object Enrollment(Enroll enroll) throws ServiceException {
		Object returnObject = null;
		try {
			returnObject = dao.Enrollment(enroll);
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage(),e);
		}
		return returnObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object listOfUIDs() throws ServiceException {
		List<Object> list;
		try {
			list = (List<Object>) dao.listOfUIDs();
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage(),e);
		}
		return list;
	}

	@Override
	public Object Administration(Admin admin) throws ServiceException {
		try {
			dao.Administration(admin);
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage(),e);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object ViewReport() throws ServiceException {
		List<Object> list;
		try {
			list = (List<Object>) dao.ViewReport();
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage(),e);
		}
		return list;
	}

}
