package com.training;


// first step is always class declaration & in this case 
// 1.to reduce redundancy we are instantiating
// 2.no setter getter since no attributes declared.
public class BillManager {

	private MeterReading reading; // instantiation of reading belonging to MeterReading class
	
	

public BillManager(MeterReading reading) {
		super();
		this.reading = reading;
	}



public BillManager() {
		super();
		// TODO Auto-generated constructor stub
	}



	// examples for overloaded method.	
	public double calculateBillAmount(MeterReading reading){
		
		double amount = 0;
		
		double unitConsumed = reading.getCurrentReading() - reading.getLastReading();
		
		
		if(reading.getConsumerType().equals("DOM")){
			
			if (unitConsumed>200){
				
				amount = unitConsumed*4.0;
				
			}
		
			else
			{
				amount = unitConsumed*1.25;
				
			}
		}
		
		
		if(reading.getConsumerType().equals("COM")){
			
			if (unitConsumed>200){
				
				amount = unitConsumed*4.0;
				
			}
		
			else
			{
				amount = unitConsumed*2.50;
				
			}
		}
		
			return amount;
			
	}

	/**
	 * OVERLOADED METHOD
	 * @return
	 */
	
	
public double calculateBillAmount(){
		
		double amount = calculateBillAmount(reading);
	
		return amount;
		
}
	
	public MeterReading getReading() {
		return reading;
	}



	public void setReading(MeterReading reading) {
		this.reading = reading;
	}


}
