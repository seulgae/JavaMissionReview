//알파코드 :      이 름 :
//프로그램이 정상적으로 컴파일되고 실행될 수 있도록 Vehicle 클래스 안에 알맞은 코드(생성자)를 작성하시오. 

package q08;

class Vehicle {
	private String modelName = "미정";
	private int maxSpeed = 0;
	private int numOfLimit = 0;
	
	//아래에 생성자를 생성하시오.
	
	//displayInfo()메서드는 수정하지 마시오.
	public void displayInfo() {
		System.out.println("모 델 명 : " + modelName);
		System.out.println("최고속도 :" + maxSpeed + "km");
		System.out.println("최대정원 :" + numOfLimit + "명");
		System.out.println("---------------------------------------");
	}
}

public class MyTest {
	//main()메서드는 수정하지 마시오.
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("보잉747");
		Vehicle v3 = new Vehicle("소나타III", 220);
		Vehicle v4 = new Vehicle("카페리", 50, 350);
		
		v1.displayInfo();
		v2.displayInfo();
		v3.displayInfo();
		v4.displayInfo();
	}
}
