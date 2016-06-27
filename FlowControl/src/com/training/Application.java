package com.training;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Consumer Number");
		
			long consumerNumber = sc.nextLong();
		System.out.println("Consumer Name");
		
			String consumerName = sc.next();
		System.out.println("Last Reading");
			double lastReading = sc.nextDouble();
		
		System.out.println("Current Reading");
			double currentReading = sc.nextDouble();
		
		System.out.println("Consumer Type [DOM-COM]");
				String consumerType = sc.next();
				
				MeterReading reading =
						new MeterReading(consumerNumber, consumerName, lastReading, 
											currentReading, consumerType);
		
		BillManager mgr1 = new BillManager();		   // zero value constructor 
		double amount1 = mgr1.calculateBillAmount(reading);
		System.out.println(amount1);
		 
		 BillManager mgr2 = new BillManager(new MeterReading(102,"POC",600,1800,"DOM"));   // default constructor
		 double amount2 = mgr2.calculateBillAmount();
		 System.out.println(amount2);
	}

}
