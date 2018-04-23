package com.atguigu.bookstore.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * JDBC操作工具类
 *
 */
public class JDBCUtils {
	/**
	 * 释放Connection连接
	 * 
	 * @param connection
	 * @throws SQLException
	 */

	public static void releaseConnection(Connection connection) {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ---------第一种方式
	private static DataSource dataSource = null;
	static {
		dataSource = new ComboPooledDataSource("bookstoreapp");
	}

	/**
	 * 返回数据库的一个Connection对象
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {

		return dataSource.getConnection();
	}

//	// ---------第二种方式
//	public Connection openConnection() {
//		Properties prop = new Properties();
//		String driver = null;
//		String url = null;
//		String username = null;
//		String password = null;
//		try {
//			prop.load(this.getClass().getClassLoader().getResourceAsStream("DBConfig.properties"));
//			driver = prop.getProperty("driver");
//			url = prop.getProperty("url");
//			username = prop.getProperty("username");
//			password = prop.getProperty("password");
//			Class.forName(driver);
//			return DriverManager.getConnection(url, username, password);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//
//	}

	public static void release(ResultSet rs, PreparedStatement statement) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
