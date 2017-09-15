package com.java.thread;

public class ThreadSleep {

    public static void main(String[] args) {

        MyRunnable4 myRunnable = new MyRunnable4();
        Thread thread = new Thread(myRunnable);

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                thread.start();
                try {
                	//当前线程睡眠1毫秒 cpu立即执行新建的就绪进程
                    Thread.sleep(1);   // 使得thread必然能够马上得以执行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyRunnable4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}