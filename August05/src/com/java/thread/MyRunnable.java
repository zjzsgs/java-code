package com.java.thread;

public class MyRunnable implements Runnable{

	private String name;
	public MyRunnable(String name){
		this.name = name;
	}
	public void run() {
//		for (int i = 0; i < 1000; i++) {
//			System.out.println(name+":"+i);
//		}
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+":"+i);
			if(i==10){
				System.out.println("礼让");
				Thread.yield();
			}
		}
	}

}
