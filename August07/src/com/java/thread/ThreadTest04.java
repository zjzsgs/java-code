package com.java.thread;
/**
 * 销毁线程
 * @author zjz
 *
 */
public class ThreadTest04 {

    public static void main(String[] args) {

        MyRunnable2 myRunnable = new MyRunnable2();
        Thread thread = new Thread(myRunnable);
        
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                thread.start();
            }
            if(i == 40){
                myRunnable.stopThread();
            }
        }
    }
}

class MyRunnable2 implements Runnable {

    private boolean stop;

    @Override
    public void run() {
        for (int i = 0; i < 100 && !stop; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public void stopThread() {
        this.stop = true;
    }

}