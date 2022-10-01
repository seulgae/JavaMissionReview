package ucamp.java.mission7.entity;

public class Ship extends Vehicle {
	private int replacement;
	
	public Ship() {}
	
	public Ship(String serialNo, String modelName, int maxSpeed, int numberLimit, int replacement) {
		super(serialNo, modelName, maxSpeed, numberLimit);
		this.replacement = replacement;
	}
	
	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}
	
	//-------------------------------------------------------------------------------------
	// TODO: 부모인 Vehicle에 작성된 toString() 메서드를 호출하고, 이때 얻은 문자열에 배수량 정보 문자열을 
	//       연결하여 반환하는 toString() 메서드들 아래에 작성하시오.
	//-------------------------------------------------------------------------------------



}