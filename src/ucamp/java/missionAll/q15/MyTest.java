//알파코드 :          이름 :
//클래스 AAA에 싱글톤(Singleton) 패턴을 적용하고, 기존과 같은 결과가 나오도록 main() 메서드의 코드를 수정하시오.
//(단, AAA 객체를 반환하는 메서드의 이름은 getInstance()로 할 것) 

package q15;

public class MyTest {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.print();
	}
}

class AAA {
	void print() {
		System.out.println("Hello, Java");
	}
}
