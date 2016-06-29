package com.training;

public class ExampleForJoin {

	public static void main(String[] args) {
		
		System.out.println("Main Starting");
		
		Thread info = new ReadInfo();
		
		info.start();
		
	// Comment the TRY_CATCH block and notice the change
		try{
			
			//System.out.println("Is interrupted  ");
			info.join();
		} catch(InterruptedException e){
			
			e.printStackTrace();
		}

		System.out.println(info.isAlive());
		
	// The Rebirth can't take place. Hence it will throw aan EXCEPTION.
		info.start();
		
		System.out.println("Main Finished");
	}

}
