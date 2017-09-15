package com.java.thread;

class MyRun implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+":"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadDemo03 {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
		Thread t1 = new Thread(new MyRun(),"A"); 
		Thread t2 = new Thread(new MyRun(),"B"); 
		Thread t3 = new Thread(new MyRun(),"C");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
