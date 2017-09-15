package com.hand.java.thread;

public class PrintNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Print p = new Print();//创建Print类对象 为了调用类中方法
		for (int i = 0; i < 3; i++) {//循环创建3个线程
			new Thread(new Runnable() {

				@Override
				public void run() {
					for (int j = 0; j < 5; j++) {
						p.print(Thread.currentThread().getName());//传递线程名字 后面将线程名字换成的i的值了
					}
				}
			},i+"").start();
		}
	}
}

class Print{
	private int number = 1;//定义数字变量
	private int stage = 1;//定义线程编号
	public synchronized void print(String name) {//同步锁
		int thread  = Integer.parseInt(name)+1;//获得线程名转成int类型 +1
			while(thread!=stage){//判断从第一个线程开始
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			for (int i = 0; i < 5; i++) {//每个线程打印5个数字
				System.out.println("线程"+thread+":"+number++);
//				System.out.println(Thread.currentThread().getName()+":"+number++);
			}
			stage = stage%3+1;//线程按1，2，3循环
			this.notifyAll();//唤醒其他线程		
	}
}
