package ucamp.java.mission7.entity;

public class Airplane extends Vehicle {
	private int numOfEngine;
	
	public Airplane(String serialNo, String modelName, int maxSpeed, int numberLimit, int numOfEngine) {
		super(serialNo, modelName, maxSpeed, numberLimit);
		this.numOfEngine = numOfEngine;
	}
	
	public int getNumOfEngine() {
		return numOfEngine;
	}

	public void setNumOfEngine(int numOfEngine) {
		this.numOfEngine = numOfEngine;
	}

	//-------------------------------------------------------------------------------------
	// TODO: 부모인 Vehicle에 작성된 toString() 메서드를 호출하고, 이때 얻은 문자열에 엔진개수 정보 문자열을 
	//       연결하여 반환하는 toString() 메서드들 아래에 작성하시오.
	//-------------------------------------------------------------------------------------



}
