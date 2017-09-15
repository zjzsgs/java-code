package com.java.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {

	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;

	private static final ConnectionFactory factory = new ConnectionFactory();

	private Connection conn;

	static {// 静态代码块
			// 静态代码块 初始化类 只执行一次
		Properties prop = new Properties();// 键值对
		try {
			// 读取属性文件内容到输入流
			InputStream in = ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("D:\\DataSource\\MyEclipse 10\\August10\\jdbc.properties");
			prop.load(in);// 从输入流中读入键值对
		} catch (Exception e) {
			System.out.println("配置文件读取错误");
		}
		// 赋值
		driver = prop.getProperty("driver");
		dburl = prop.getProperty("dburl");
		user = prop.getProperty("user");
		password = prop.getProperty("password");
	}

	private ConnectionFactory() {

	}

	public static ConnectionFactory getInstance() {// 获取实例
		return factory;// 单例模式 保证程序运行期间只有一个
	}

	public Connection makeConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(dburl, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
