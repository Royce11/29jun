package com.training;

public class SecondThread implements Runnable {

	@Override
	public void run() {
		
			for(int i=0; i<=10; i++)
			{
				System.out.print(i+ "From Current Thread :="+Thread.currentThread().getName());
				System.out.println(i);
			}
		}

	}


