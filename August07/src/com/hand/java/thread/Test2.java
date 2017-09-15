package com.hand.java.thread;

public class Test2 {
	public static void main(String[] args) {
		Resource resource = new Resource();
        new Thread(new Producer(resource)).start();//生产者线程
        new Thread(new Consumer(resource)).start();//消费者线程
	}
}
