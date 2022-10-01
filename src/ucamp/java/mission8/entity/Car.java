package ucamp.java.mission8.entity;

import java.io.*;

public class Car extends Vehicle {
	private int mileage;
	
	public Car() {}
	
	public Car(String modelName, int maxSpeed, int numberLimit, int mileage) {
		super(modelName, maxSpeed, numberLimit);
		this.mileage = mileage;
	}
	
	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void displayInfo(PrintWriter out) {
		super.displayInfo(out);
		out.println(" 평균연비 : " + mileage + "km/l");
	}
}
