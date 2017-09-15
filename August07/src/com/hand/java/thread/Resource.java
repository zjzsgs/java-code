package com.hand.java.thread;

public class Resource {
    /*资源序号*/
    private int number = 0;
    /*资源标记*/
    private boolean flag = false;//资源是否创建

    /**
     * 生产资源
     */
    public synchronized void create() {
    	//IF语句运行完毕后，接着运行下面的语句。而While中的执行语句运行完毕后，还要进行继续判断条件是否符合循环条件，根据判断的条件，返回执行语句或继续运行下面的程序。
        while (flag) {//先判断标记是否已经生产了，如果已经生产，等待消费；
            try {
                wait();//让生产线程等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number++;//生产一个
        System.out.println(Thread.currentThread().getName() + "生产者------------" + number);
        flag = true;//将资源标记为已经生产
        notifyAll();//唤醒在等待操作资源的线程（队列）
    }

    /**
     * 消费资源
     */
    public synchronized void destroy() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + "消费者****" + number);

        flag = false;
        notifyAll();
    }
}