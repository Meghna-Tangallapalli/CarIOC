package com.cariocproject;

public class Car {

	IEngine engine;//instance variable

	//constructor
	public Car(IEngine engine) {
		super();
		this.engine = engine;//local variable
	}

	
	//setter
	/*
	 * public void setEngine(IEngine engine) { this.engine = engine; }
	 */

	public void drive() {
		int engStatus = engine.start();
		if (engStatus == 1) {
			System.out.println("journey started");
		} else {
			System.out.println("journey not started");
		}
	}
}
