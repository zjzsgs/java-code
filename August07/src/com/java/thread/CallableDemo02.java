package com.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable<Integer>{
	private int i=0;
	//与run方法不同 call方法有返回值 并可抛出异常
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			sum = sum+i;
		}
		return sum;
	}
	
}

public class CallableDemo02 {
	public static void main(String[] args) {
		Callable<Integer> myCallable = new MyCallable();//创建M有Callable对象
		FutureTask<Integer> ft = new FutureTask<Integer>(myCallable);//使用FutureTask来包装MyCallable对象
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			if(i==30){
				Thread thread = new Thread(ft);//FutureTask对象作为Thread对象的target创建新的进程
				thread.start();//进程就绪
			}
		}
		System.out.println("主循环执行for完毕");
		int sum;
		try {
			//当子线程此方法还未执行完毕，ft.get()方法会一直阻塞，直到call()方法执行完毕才能取到返回值。
			sum = ft.get();//获取新创建的线程中的call()方法返回的结果
			//所以sun总是最后输出
			System.out.println("sum="+sum);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
