package com.java.thread;

/**
 * 继承Thread类
 * @author zjz
 *
 */
class MyThread extends Thread{
	private int i = 0;
	@Override
	public void run() {
		for (i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		super.run();
	}
}

public class ThreadTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			if(i == 30){//先执行主线程  当主线程到30 再新建另外两个线程
				Thread t1 = new MyThread();//新建状态
				Thread t2 = new MyThread();//新建状态
				t1.start();//就绪状态
				t2.start();//就绪状态
			}
		}
	}

}
