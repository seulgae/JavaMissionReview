package ucamp.java.mission6.entity;

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

	public void displayInfo() {
		super.displayInfo();
		System.out.println(" 평균연비 : " + mileage + "km/l");
	}
}
