package com.java.thread;

public class ThreadPriority {

    public static void main(String[] args) {
        Thread myThread = new MyThread4();
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
            if (i == 20) {
                myThread.setPriority(Thread.MAX_PRIORITY);//设置较高优先级 不代表优先执行 只是执行机会较多
                myThread.start();
            }
        }
    }

}

class MyThread4 extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
    }
}