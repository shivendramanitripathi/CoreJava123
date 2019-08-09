package com.uid.dao;

import java.util.ResourceBundle;

import com.uid.exception.DaoException;

public class DaoFactory {
	
	private static String dao;
	
	static{
		ResourceBundle res  = ResourceBundle.getBundle("com.uid.prop.config");
		dao = res.getString("dao");		
	}
	
	public UIDDao getDao() throws DaoException{
		try {
			return (UIDDao) Class.forName(dao).newInstance();
		} catch (InstantiationException e) {
			throw new DaoException(e.getMessage(),e);
		} catch (IllegalAccessException e) {
			throw new DaoException(e.getMessage(),e);
		} catch (ClassNotFoundException e) {
			throw new DaoException(e.getMessage(),e);
		}
		
	}
	
}
