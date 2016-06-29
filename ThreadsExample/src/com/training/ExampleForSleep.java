package com.training;

public class ExampleForSleep {

	public static void main(String[] args) {
		
		try {
			System.out.println("SBBB");
			Thread.sleep(600);
			
			System.out.println("Sapient");
			Thread.sleep(600);
			
			System.out.println("Brilliant");
			Thread.sleep(600);
			
			System.out.println("Batch");
			Thread.sleep(600);
			
			System.out.println("B !!!!");
			Thread.sleep(600);
			
		} catch (InterruptedException e){
			
			e.printStackTrace();  //StoreHouse for threads
		}
	}

}
