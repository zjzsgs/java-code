package com.java.thread;

/**
 * 实现Runnable接口
 * @author zjz
 *
 */
class MyRunnable implements Runnable{
	
	private int i;
	@Override
	public void run() {
		for (i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}

public class ThreadTest02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);//打印主线程
			if(i==30){
				Runnable r = new MyRunnable();//创建一个Runnable实现类对象
				Thread t1 = new Thread(r);//将r作为Thread target创建新的线程
				Thread t2 = new Thread(r);
				t1.start();//调用start()方法使得线程进如就绪状态
				t2.start();
			}
		}
	}

}
