package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest01 {
	public static void main(String[] args) {
		
		String sql = "select * from tbl_user";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			//加载数据库驱动。通过Class类的forName()静态方法来加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//通过DriverManager获取数据库连接Connection对象。
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc","root","");
			//通过Connection对象创建Statement对象 。 执行sql的语句 执行对象
			st = conn.createStatement();
			//使用Statement执行SQL语句。
			rs = st.executeQuery(sql);
			// 操作结果集。
			while(rs.next()){//next()、 previous()、 first()、 last()、 beforeFirst()、 afterLast()、 absolute()
				//getXxx()方法获取记录指针指向行、特定列的值。
				System.out.print(rs.getInt("id")+" ");
				System.out.print(rs.getString("name")+" ");
				System.out.print(rs.getString("password")+" ");
				System.out.print(rs.getString("email")+" ");
				System.out.println();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//回收数据库资源，包括ResultSet、Statement和Connection等资源。
			try {
				if (rs != null){  
				    rs.close();  
				    rs=null;  
				}  
				if (st != null){  
				    st.close();  
				    st=null;  
				}  
				if (conn != null){  
				    conn.close();  
				    conn=null;  
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  
//			try {
//				rs.close();				
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			try {
//				st.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
		}
	}
	
	
}
