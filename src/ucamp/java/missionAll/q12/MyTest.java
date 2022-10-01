//알파코드 :          이름 :
//주워진 클래스를 아래와 같이 수정하되 결과가 이전과 동일하도록 수정하시오. 
//
//	1. Vehicle 클래스를 캡슐화(Encapsulation) 시킨다.
//	2. VehicleDriver 클래스를 수정한다.
//
//작성할 Vehicle 생성자는 파라메터(Parameter)의 개수가 1개이며, 
//생성자 안에서 맴버변수 modelName을 초기화 한다.
//나머지 maxSpeed, numOfLimit 맴버변수는 setter(세터) 메서드를 이용하여 초기화 해야 한다.
//(파라메터가 1개가 아닌 다른 생성자는 만들지 말 것)

package q12;

//클래스를 캡슐화 시키시오.
class Vehicle {
	String modelName;
	int maxSpeed;
	int numOfLimit;
	
	void displayInfo() {
		System.out.println("모델명 : " + modelName);
		System.out.println("최고속력 : " + maxSpeed);
		System.out.println("탑승정원 : " + numOfLimit);
	}
}

//캡슐화된 Vehicle 클래스를 처리하도록 수정하시오.
public class MyTest {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.modelName = "보잉747";
		v.maxSpeed = 1400;
		v.numOfLimit = 250;
		
		v.displayInfo();
	}
}