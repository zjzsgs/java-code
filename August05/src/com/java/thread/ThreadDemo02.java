package com.java.thread;

public class ThreadDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable("A");
		MyRunnable r2 = new MyRunnable("B");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
//		System.out.println(t.isAlive());
		t1.start();
		t2.start();
//		for (int i = 0; i < 50; i++) {
//			if(i>10){
//				try {
//					t.join();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//			}
//			System.out.println("主线程:"+i);
//		}
		
//		System.out.println(t.isAlive());
	}

}
