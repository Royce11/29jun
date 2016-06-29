package com.training;

public class UsingRunnable {

	public static void main(String[] args) {
		
		Runnable runnable = new SecondThread();
		
		Thread t1 = new Thread(runnable,"Ramesh");
		
		Thread t2 = new Thread(runnable,"Rajesh");
		
		Thread t3 = new Thread(runnable,"Rakesh");
	
		t1.start();
		t2.start();
		t3.start();
		
	}

}
