package com.training;

public class SynchronizationExample {

	public static void main(String[] args) {
		
	// All of them access the UsePrintString simultaneously. So chaos
		new UsePrintString("idly","Sambar");
		new UsePrintString("Pizza","Coke");
		new UsePrintString("Paratha", "Achar");

	}

}
