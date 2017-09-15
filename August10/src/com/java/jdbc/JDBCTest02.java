package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest02 {
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc","root","");
		} catch (Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void insert(){
		Connection conn = getConnection();
		try {
			String sql = "insert into tbl_user(name,password,email)"+"values('Tom','123456','123@123.com')";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("向用户插入表了"+count+"条数据");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void select(){
		Connection conn = getConnection();
		try {
			String sql = "select * from tbl_user";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			System.out.println("查询用户表数据");
			while(rs.next()){
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("password")+" "+rs.getString("email"));
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void update(){
		Connection conn = getConnection();
		try {
			String sql = "update tbl_user set email='tom@qq.com' where name = 'Tom'";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("向用户表更新了"+count+"条数据");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void delete(){
		Connection conn = getConnection();
		try {
			String sql = "delete from tbl_user where name = 'Tom'";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("向用户表删除了"+count+"条数据");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		insert();
//		update();
//		delete();
		select();
	}
}
