package com.training;

public class Application {

	public static void main(String[] args) {
	
// An EXCEPTION HANDLING scenario.
		try{
			Book bk = new Book(10, "Head First Java", 500.00);
		}catch (Exception e) {
			
			System.out.println("Exception Cause"+e.getMessage());
			
			e.printStackTrace();
		}
		finally{
			
			System.out.println("Inside finally Block");
		}
		
		Book bk2 = new Book();
		
		bk2.setBookName("Effective Java");
		 bk2.setBookNumber(12);
		  bk2.setPrice(890.00);

		  // TODO Auto-generated method stub

 }

}