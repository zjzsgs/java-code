package com.java.thread;

public class ThreadDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		MyThread t1 = new MyThread("A");
//		MyThread t2 = new MyThread("B");
//		t1.run();//run方法相当于是通过对象调用方法了
//		t2.run();//线程启动应该是start()方法
//		t1.start();
//		t2.start();
		MyRunnable r1 = new MyRunnable("A");
		MyRunnable r2 = new MyRunnable("B");
//		Runnable接口不存在Thread的start方法 需要自己创建Thread类调用
		Thread t1 = new Thread(r1);//传入Runnable对象
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
	}

}
