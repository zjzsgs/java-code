package com.java.thread;

/**
 * Thread类本身也是实现了Runnable接口，而run()方法最先是在Runnable接口中定义的方法。
 * @author zjz
 *
 */
public class ThreadTest03 {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                Runnable myRunnable = new MyRunnable1();
                Thread thread = new MyThread1(myRunnable);
                thread.start();
            }
        }
    }
}

class MyRunnable1 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        System.out.println("in MyRunnable run");
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread1 extends Thread {

    private int i = 0;
    
    public MyThread1(Runnable runnable){
        super(runnable);
    }

    @Override
    public void run() {
        System.out.println("in MyThread run");
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}