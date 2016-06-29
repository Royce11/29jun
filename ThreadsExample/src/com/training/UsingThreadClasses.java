package com.training;

public class UsingThreadClasses {

	public static void main(String[] args) {
		
	// NEW THREAD
		Thread t1 = new MyThread("Ramesh");
		
		Thread t2 = new MyThread("Rajesh");
		
		Thread t3 = new MyThread("Rakesh");
	
			t1.start();
			t2.start();
			t3.start();
	
			t1.run();
			t2.run();
			t3.run();
	
	}
}
