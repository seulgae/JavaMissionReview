package ucamp.java.mission7.entity;

public class Car extends Vehicle {
	private int mileage;
	
	public Car() {}
	
	public Car(String serialNo, String modelName, int maxSpeed, int numberLimit, int mileage) {
		super(serialNo, modelName, maxSpeed, numberLimit);
		this.mileage = mileage;
	}
	
	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	//-------------------------------------------------------------------------------------
	// TODO: 부모인 Vehicle에 작성된 toString() 메서드를 호출하고, 이때 얻은 문자열에 평균연비 정보 문자열을 
	//       연결하여 반환하는 toString() 메서드들 아래에 작성하시오.
	//-------------------------------------------------------------------------------------
	
	
}
