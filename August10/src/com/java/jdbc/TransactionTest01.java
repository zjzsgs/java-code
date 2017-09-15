package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest01 {
	
	public static Connection getConn(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void insertUserData(Connection conn) throws SQLException{
			String sql = "insert into tbl_user(id,name,password,email)"+" values(10,'Tom','123456','tom@qq.com')";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("向用户表中插入了"+count+"条数据");
	}
	
	public static void insertAddressData(Connection conn) throws SQLException {
			String sql = "insert into tbl_address(id,city,country,user_id)"+"values(1,'shanghai','china',10)";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("向地址表中插入了"+count+"条数据");
	}
	
	public static void main(String[] args) {
		Connection conn = null;		
		try {
			conn=getConn();
			conn.setAutoCommit(false);//关闭自动提交
			insertUserData(conn);
			insertAddressData(conn);
			conn.commit();//提交事务
		} catch (SQLException e) {
			System.out.println("========捕获到SQL异常==========");
			e.printStackTrace();
			try {
				conn.rollback();//回滚
				System.out.println("===============事务回滚成功===========");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally{
			try {
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
	}
}
