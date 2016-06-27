package com.training;

// the first class
public class MeterReading {

	private long consumerNumber;
	private String consumerName;
	private double lastReading;
	private double currentReading;
	private String consumerType;
	
	public MeterReading() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MeterReading(long consumerNumber, String consumerName, double lastReading, double currentReading,
			String consumerType) {
		super();
		this.consumerNumber = consumerNumber;
		this.consumerName = consumerName;
		this.lastReading = lastReading;
		this.currentReading = currentReading;
		this.consumerType = consumerType;
	}

	public long getConsumerNumber() {
		return consumerNumber;
	}

	public void setConsumerNumber(long consumerNumber) {
		this.consumerNumber = consumerNumber;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public double getLastReading() {
		return lastReading;
	}

	public void setLastReading(double lastReading) {
		this.lastReading = lastReading;
	}

	public double getCurrentReading() {
		return currentReading;
	}

	public void setCurrentReading(double currentReading) {
		this.currentReading = currentReading;
	}

	public String getConsumerType() {
		return consumerType;
	}

	public void setConsumerType(String consumerType) {
		this.consumerType = consumerType;
	}

	
	
	
}
