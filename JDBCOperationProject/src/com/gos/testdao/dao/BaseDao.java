
/**
 *
 */
package com.gos.testdao.dao;

import com.gos.testdao.exception.DaoException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;


/**
 * @author M1012783
 *
 */
public abstract class BaseDao {
    private static String url;
    private static String username;
    private static String password;
    private static String driver;
    private Connection con;

    static{
        ResourceBundle res  = ResourceBundle.getBundle("com.gos.testdao.props.database");
        url = res.getString("url");
        driver = res.getString("driver");
        username = res.getString("username");
        password = res.getString("password");

    }

    public BaseDao() throws DaoException{
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new DaoException(e.getMessage(),e);
        }
    }

    public Connection getConnection() throws DaoException{
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new DaoException(e.getMessage(),e);
        }
        return con;

    }

    public void releaseResource(ResultSet rs,Statement stmt,Connection con) throws DaoException{

        try {
            if(rs != null){
                rs.close();
            }
        }catch (SQLException e) {
            throw new DaoException(e.getMessage(),e);
        }

        try {
            if(stmt != null){
                stmt.close();
            }
        }catch (SQLException e) {
            throw new DaoException(e.getMessage(),e);
        }

        try {
            if(con != null){
                con.close();
            }
        }catch (SQLException e) {
            throw new DaoException(e.getMessage(),e);
        }
    }
}