//알파코드 :          이름 :
//두 개의 doWork 메서드를 하나로 통합하고 이전과 같은 결과가 출력되도록 코드를 수정하시오. 

//[출력 결과]
//자동차 시동이 걸렸습니다.
//자동차가 움직입니다.
//전등이 켜졌습니다.

package q20;

public class MyTest {
	//main 메서드는 수정하지 마시오.
	public static void main(String[] args) {
		doWork(new Car());
		doWork(new Lamp());
	}
	
	//아래 두개의 doWork()를 하나의 메서드로 통합하시오.
	private static void doWork(Car car) {
		car.on();
		car.move();
	}
	
	private static void doWork(Lamp lamp) {
		lamp.on();
	}
}

//아래의 두 인터페이스는 수정하지 마시오.
interface Switch {
	void on();
	void off();
}

interface Movable {
	void Move();
}

//아래의 Car 클래스와 Lamp 클래스를 인터페이스를 사용하도록 수정하시오.
class Car {
	void on() {
		System.out.println("자동차 시동이 걸렸습니다.");
	}
	
	void off() {
		System.out.println("자동차 시동이 꺼졌습니다.");
	}
	
	void move() {
		System.out.println("자동차가 움직입니다.");
	}
}

class Lamp {
	void on() {
		System.out.println("전등이 켜졌습니다.");
	}
	
	void off() {
		System.out.println("전등이 꺼졌습니다.");
	}	
}



