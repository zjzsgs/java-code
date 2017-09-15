package com.java.thread;

public class ThreadDaemon {

    public static void main(String[] args) {
        Thread myThread = new MyThread2();
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
            if (i == 20) {
                myThread.setDaemon(true);//将myThread设置为后台线程 在start()之前
                myThread.start();
            }
        }
        //前天线程都死亡后，JVM通知后台线程死亡，但从接收指令到作出响应，需要一定的时间。所以后台线程会继续打印一会
    }

}

class MyThread2 extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}