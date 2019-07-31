package com.gos.testdao.dao;

import com.gos.testdao.exception.DaoException;
import com.gos.testdao.model.TestTable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestDaoImpl extends BaseDao implements TestDao {
    private Connection con;

    public TestDaoImpl() throws DaoException {
    }

    @Override
    public List<TestTable> getTestTableData() {
        Statement stmt = null;
        ResultSet rs = null;
        List<TestTable> listOfTestTables = new ArrayList<TestTable>();
        try {
            con = getConnection();
            if(con == null){
                System.out.println("Connection object is null");
            }else{
                System.out.println("Connection found successfully");
            }
            stmt = con.createStatement();
            rs = stmt.executeQuery("select column1, column2, column3, column4 from hr.test_table");
            while(rs.next()){
                TestTable testTable = new TestTable();
                testTable.setColumn1(rs.getInt("column1"));
                testTable.setColumn2(rs.getString("column2"));
                testTable.setColumn3(rs.getInt("column3"));
                testTable.setColumn4(rs.getString("column4"));
                listOfTestTables.add(testTable);
            }
        } catch (DaoException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            try {
                releaseResource(rs, stmt, con);
            } catch (DaoException e) {
                e.printStackTrace();
            }
        }

        return listOfTestTables;
    }

    @Override
    public int insertTestTableData(TestTable testTable) {
        PreparedStatement psmt = null;
        ResultSet rs = null;
        int recordsInserted = 0;
        try {
            con = getConnection();
            con.setAutoCommit(false);
            if(con == null){
                System.out.println("Connection object is null");
            }else{
                System.out.println("Connection found successfully");
            }
            psmt = con.prepareStatement("insert into test_table(column1, column2, column3, column4) values(?, ?, ?, ?)");
            psmt.setInt(1, testTable.getColumn1());
            psmt.setString(2, testTable.getColumn2());
            psmt.setInt(3, testTable.getColumn3());
            psmt.setString(4, testTable.getColumn4());

            recordsInserted = psmt.executeUpdate();
            if(recordsInserted > 0){
                con.commit();
            }
        } catch (DaoException e) {
            e.printStackTrace();
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }catch (SQLException e) {
            e.printStackTrace();
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        finally{
            try {
                releaseResource(rs, psmt, con);
            } catch (DaoException e) {
                e.printStackTrace();
            }
        }
        return recordsInserted;
    }

    @Override
    public int updateTestTableData(int column1, String column2) {
        PreparedStatement psmt = null;
        ResultSet rs = null;
        int recordsUpdated = 0;
        try {
            con = getConnection();
            con.setAutoCommit(false);
            if(con == null){
                System.out.println("Connection object is null");
            }else{
                System.out.println("Connection found successfully");
            }
            psmt = con.prepareStatement("update test_table set column2 = '"+column2+"' where column1 = "+column1);
            recordsUpdated = psmt.executeUpdate();
            if(recordsUpdated != 0){
                con.commit();
            }
        } catch (DaoException e) {
            e.printStackTrace();
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }catch (SQLException e) {
            e.printStackTrace();
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        finally{
            try {
                releaseResource(rs, psmt, con);
            } catch (DaoException e) {
                e.printStackTrace();
            }
        }
        return recordsUpdated;
    }

    @Override
    public int deleteTestTableData(int column1) {
        PreparedStatement psmt = null;
        ResultSet rs = null;
        int recordsDeleted = 0;
        try {
            con = getConnection();
            con.setAutoCommit(false);
            if (con == null) {
                System.out.println("Connection object is null");
            } else {
                System.out.println("Connection found successfully");
            }
            psmt = con.prepareStatement("Delete from Test_table where column1 = "+column1);
            recordsDeleted = psmt.executeUpdate();
            if (recordsDeleted != 0) {
                con.commit();
            }
        } catch (DaoException e) {
            e.printStackTrace();
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            try {
                releaseResource(rs, psmt, con);
            } catch (DaoException e) {
                e.printStackTrace();
            }
        }
        return recordsDeleted;
    }
}