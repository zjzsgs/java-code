package com.java.thread;

class MyThreadDemo implements Runnable{

	private int ticket = 5;
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
//			synchronized(this){//同步代码块
//			if(ticket>0){
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.println("车票:"+ticket--);
//			}
//			}
			tell();
		}
	}
	
	public synchronized void tell(){//同步方法
		if(ticket>0){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("车票:"+ticket--);
		}
	}
	
}
public class ThreadDemo04 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MyThreadDemo m = new MyThreadDemo();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		Thread t3 = new Thread(m);
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
