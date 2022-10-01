//알파코드 :      이 름 :
//아래 코드는 myMethod 메서드 호출에 문제가 있는 코드이다.
//컴파일 오류가 발생하지 않고 수행 결과 100이 출력되도록 코드를 수정하시오.

package q10;

public class MyTest {
	int a = 10;
	
	//myMethod 메서드는 수정하지 마시오.
	public int myMethod() {
		return a * a;
	}
	
	public static void main(String[] args) {
		//아래 코드를 수정하시오.
		int a = myMethod();
		
		System.out.println(a); //이 줄은 수정하지 마시오.
	}
}
