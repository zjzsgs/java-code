package com.hand;
/**
 * �߳�ͬ��
 * @author zjz
 *
 */
public class ThreadSynchronized {
	class Bank{
		private int account = 100;
		public int getAccount(){
			return account;
		}
		//ͬ������
		public synchronized void save(int money){
			account += money;
		}
		//ͬ�������
		public void save1(int money){
			synchronized(this){
				account += money;
			}
		}		
	}
	class MyThread implements Runnable{

		private Bank bank;
		public MyThread(Bank bank){
			this.bank = bank;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++) {
				bank.save(10);
				bank.save1(10);
				System.out.println(i+"�˻����Ϊ��"+bank.getAccount());
			}
		}
	}
	public void useThread() {
        Bank bank = new Bank();
        MyThread new_thread = new MyThread(bank);
        System.out.println("�߳�1");
        Thread thread1 = new Thread(new_thread);
        thread1.start();
        System.out.println("�߳�2");
        Thread thread2 = new Thread(new_thread);
        thread2.start();
    }
	public static void main(String[] args) {
		ThreadSynchronized ts = new ThreadSynchronized();
		ts.useThread();
    }
}
