package com.example;

public class Airtel implements Sim{

	@Override
	public void typeOfSim() {
		System.out.println("this is an airtel sim");
		
	}

	@Override
	public void dataTypeOfSim() {
		System.out.println("this supports a 5G data ");
		
	}
}
