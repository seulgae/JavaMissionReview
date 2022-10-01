//알파코드 :          이름 :
//실행결과 "김갓갓 대학생이 도서관에서 공부를 합니다." 가 출력되도록 프로그램을 수정하시오. 

package q14;

//아래 학생 클래스는 수정하지 마시오.
class 학생 {
	String name;

	public 학생(String name) {
		this.name = name;
	}
	
	public void 공부하다() {
		System.out.println(name + " 학생이 열심히 공부를 합니다.");
	}
}

class 대학생 {
	//여기에 코드를 작성하시오.
}

public class MyTest {
	//main() 메서드를 수정하지 마시오.
	public static void main(String[] args) {
		학생 s1 = new 대학생("김삿갓");
		
		s1.공부하다();
	}
}