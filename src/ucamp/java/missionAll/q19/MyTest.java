//알파코드 :          이름 :
//아래 프로그램은 실행 중 예외사항이 발생할 수 있다.
//연산이 불가능한 경우, 결과 대신 "(불능)"을 출력하도록 하고 
//항상 10줄의 결과가 출력되도록 main() 메서드를 수정하시오.  

package q19;

import java.util.Random;

public class MyTest {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println("결과" + (i + 1) + ": " + (10 / Operation.getRandomInt()));	//이 줄은 수정하지 마시오.
		}
	}
}

//아래 클래스는 수정하지 마시오.
class Operation {
	public static int getRandomInt() {
		return new Random().nextInt(5);		//0~4 사이의 난수를 반환하는 코드
	}
}
