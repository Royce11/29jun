package com.training;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Mention your purchase below");
	
   double purchase = sc.nextDouble();
   
   
   TaxWhiz tw = new TaxWhiz(12, 50); //via this only we resolve dat static reference issue. then we use it locally
   
   System.out.println("Sales Tax applicable on your purchase is " +  tw.calcTax(purchase));
   
	}

}
