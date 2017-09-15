package com.java.thread;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskWithResult implements Callable<String>{

	private int id;
	
	public TaskWithResult(int id){
		this.id = id;
	}
	
	@Override
	public String call() throws Exception {
		return "result of TaskWithResult "+id;
	}
	
}

public class CallableDemo01 {

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++) {
			results.add(exec.submit(new TaskWithResult(i)));
		}
		for(Future<String> fs : results){
			if(fs.isDone()){
				System.out.println(fs.get());
			}else{
				System.out.println("Future result is not yet complete");
			}
		}
		exec.shutdown();
	}

}
