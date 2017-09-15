package com.hand;

public class MyThread extends Thread implements Runnable{
	public void run(){
		System.out.print("MyThread.run()");
	}
	public static void main(String args[]){
		
		MyThread myThread1 = new MyThread();
//		继承Thread类
//		MyThread myThread2 = new MyThread();
//		myThread1.start();
//		myThread2.start();
//		实现Runnable接口
		Thread thread = new Thread(myThread1);//start()是Thread的方法
		thread.start();
	}
}




