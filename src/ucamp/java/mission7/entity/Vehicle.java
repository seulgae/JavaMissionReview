package ucamp.java.mission7.entity;

public abstract class Vehicle {
	private String serialNo;
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private boolean available;
	
	public Vehicle() {
	}
	
	public Vehicle(String serialNo, String modelName, int maxSpeed, int numberLimit) {
		this.serialNo = serialNo;
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
	}
	
	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getNumberLimit() {
		return numberLimit;
	}
	
	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	//-------------------------------------------------------------------------------------------
	// TODO: Vehicle 객체 내의 4가지 속성값을 사용해 아래와 같은 문자열을 반환하는 toString() 메서드를 아래에 작성하시오.
	//       (\n을 적절히 사용하여 출력 시 속성값이 각각의 행에 출력될 수 있도록 문자열 구성)
	//
	// (문자열 출력 시 표시 예)
	// ----------------------------
	// 일련번호 : A001
	// 모 델 명 : 보잉747
	// 최고속도 : 1300km/h
	// 최대정원 : 300명
	//-------------------------------------------------------------------------------------------

	
	
	
	
}