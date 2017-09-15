package com.java.thread;

public class ThreadYield {

    public static void main(String[] args) {
        Thread myThread1 = new MyThread5();
        Thread myThread2 = new MyThread6();
        myThread1.setPriority(Thread.MAX_PRIORITY);
        myThread2.setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
            if (i == 20) {
                myThread1.start();
                myThread2.start();
                Thread.yield();//主线程礼让
            }
        }
    }

}

class MyThread5 extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("myThread 1 --  i = " + i);
        }
    }
}

class MyThread6 extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("myThread 2 --  i = " + i);
        }
    }
}