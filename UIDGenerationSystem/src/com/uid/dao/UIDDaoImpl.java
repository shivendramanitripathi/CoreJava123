package com.uid.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.uid.exception.DaoException;
import com.uid.model.Admin;
import com.uid.model.Enroll;
import com.uid.model.Report;

public class UIDDaoImpl extends BaseDao implements UIDDao {

	private static final String enrolQuery = "insert into hr.enroll(enroll_id,name,CONTACT_NO,look) values(?, ?,?,?)";
	private static final String uidGenerationQuery = "select uid_seq.nextval from dual";
	private static final String uidQuery = "select uid from hr.enroll";
	private static final String adminQuery = "delete from hr.admin where uid = ?";
	//private static final String reportQuery = "select uid,name,CONTACT_NO,look from hr.enroll e, hr.admin a where e.uid = a.uid";
	private static final String reportQuery = "select enroll_id,name,CONTACT_NO,look from hr.enroll";
	private static Connection con;
	
	public UIDDaoImpl() throws DaoException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object Enrollment(Enroll enroll) throws DaoException {
		PreparedStatement psmt = null;
		int generatedID = 0;
		try {
			generatedID = generateUID();
			con = getConnection();
			psmt = con.prepareStatement(enrolQuery);
			psmt.setInt(1, generatedID);
			psmt.setString(2, enroll.getName());
			psmt.setLong(3, enroll.getCONTACT_NO());
			psmt.setString(4, enroll.getLook());
			psmt.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(),e);
		}
		finally{
			releaseResource(null, psmt, con);
		}
		
		return generatedID;
	}

	@Override
	public Object listOfUIDs() throws DaoException {
		Statement stmt = null;
		ResultSet rs = null;
		List<Report> listOfUids = new ArrayList<Report>();
		con = getConnection();
		try {
			 stmt = con.createStatement();
			 rs = stmt.executeQuery(uidQuery);
			while(rs.next()){
				Report report = new Report();
				report.setEnroll_id(rs.getInt(1));
				listOfUids.add(report);
			}
			
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(),e);
		}
		finally{
			releaseResource(rs, stmt, con);
		}
		return listOfUids;
		
	}

	@Override
	public Object Administration(Admin admin) throws DaoException {
		PreparedStatement psmt = null;
		try {
			con = getConnection();
			psmt = con.prepareStatement(adminQuery);
			psmt.setInt(1, admin.getUid());
			psmt.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(),e);
		}
		finally{
			releaseResource(null, psmt, con);
		}
		
		return null;
	}

	@Override
	public Object ViewReport() throws DaoException {
		Statement stmt = null;
		ResultSet rs = null;
		List<Report> listOfReports = new ArrayList<Report>();
		con = getConnection();
		try {
			 stmt = con.createStatement();
			 rs = stmt.executeQuery(reportQuery);
			while(rs.next()){
				Report report = new Report();
				report.setEnroll_id(rs.getInt(1));
				report.setName(rs.getString(2));
				report.setCONTACT_NO(rs.getLong(3));
				report.setLook(rs.getString(4));
				listOfReports.add(report);
			}
			
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(),e);
		}
		finally{
			releaseResource(rs, stmt, con);
		}
		return listOfReports;
	}

	@Override
	public int generateUID() throws DaoException {
		Statement stmt = null;
		ResultSet rs = null;
		con = getConnection();
		int generatedId = 0;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(uidGenerationQuery);
			while(rs.next()) {
				generatedId = rs.getInt(1);
			}
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(),e);
		}
		finally{
			releaseResource(rs, stmt, con);
		}
		return generatedId;

	}

}
