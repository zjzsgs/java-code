package com.hand;

public class MyThread extends Thread implements Runnable{
	public void run(){
		System.out.print("MyThread.run()");
	}
	public static void main(String args[]){
		
		MyThread myThread1 = new MyThread();
//		�̳�Thread��
//		MyThread myThread2 = new MyThread();
//		myThread1.start();
//		myThread2.start();
//		ʵ��Runnable�ӿ�
		Thread thread = new Thread(myThread1);//start()��Thread�ķ���
		thread.start();
	}
}




