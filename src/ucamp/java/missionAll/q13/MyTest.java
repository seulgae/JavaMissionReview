//알파코드 :          이름 :
//파일(input.txt)을 읽어 그 내용을 줄번호와 함께 화면에 출력하는 코드를 작성하시오. 
//(발생하는 Exception은 상위 메서드로 throws 처리할 것)
//
//[실행결과]
//1. Hello, Java!
//2. I'll back.
//3. U-Camp 화이팅!!!
//4. 즐거운 시간 되세요~~

package q13;

import java.util.ArrayList;

public class MyTest {
	static final String FILE_NAME = "input.txt";
	
	public static void main(String[] args) {
		ArrayList<String> list = getListFromFile(FILE_NAME);
		int lineNumber = 0;
		
		for(String str : list ) {
			//아래에 코드를 작성하시오.
		}
	}
	
	private static ArrayList<String> getListFromFile(String fileName) {	
		//아래에 코드를 작성하시오. (BufferedReader, FileReader 클래스 사용)
	}
}
