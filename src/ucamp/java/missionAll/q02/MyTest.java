//알파코드 :      이 름 :
//아래 프로그램에서 잘못된 부분을 찾아 수정하시오.
//
//[실행결과]
//1부터 100까지 더 한 합은 5050입니다.

package q02;

public class MyTest {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 100 ; i++) {
			int sum = 0;
			
			sum += i;
		}
		
		System.out.println("1부터 " + i + "까지 더 한 합은 " + sum + "입니다.");
	}
}
