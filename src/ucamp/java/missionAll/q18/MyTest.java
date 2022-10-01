//알파코드 :          이름 :
//두 변수의 내용이 대소문자가 서로 다른 부분이 있기 때문에 프로그램의 실행 결과는 "다름니다." 가 출력된다.
//대소문자의 구별하지 않으면서 동시에 공백(blank)부분이 서로 다르더라도 문장의 내용이 같으면 "같습니다."가 출력되도록 
//checkString() 메서드를 수정하시오. 

package q18;

public class MyTest {
	//main() 메서드는 수정하지 마시오.
	public static void main(String[] args) {
		String str1 = "Hello?    Are    You   OK?";
		String str2 = "Hello? Are you ok?";
		
		if (checkString(str1, str2))
			System.out.println("같습니다.");
		else
			System.out.println("다름니다.");
	}
	
	public static boolean checkString(String str1, String str2) {
		//아래 코드를 수정하시오.
		if (str1.equals(str2))
			return true;
		else
			return false;
	}
}