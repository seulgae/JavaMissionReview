package ucamp.java.mission1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessGame {
	private static final String PROMPT_MESSAGE = "1부터 100사이의 값을 입력하세요 : ";
	private static final int INVALID_INPUT = 999999;
	
	public static void main(String[] args) {
		int tryCount = 0;	//게임 시도 횟수
		int randomNum;
		int inputNum; // 사용자 입력 저장소
		
		// 받은 랜덤함수 저장
		randomNum = getRandomNumber(100);
		
		//정답 출력
//		System.out.println("<참고>정답 : " + randomNum);
		
		//5. 사용자가 난수를 맞출 때까지 반복하는 코드를 반복문(do~while)으로 작성한다.
		do {
			System.out.print("["+ ++tryCount +"번째 시도]");
			inputNum = getValidNumber();
			
			// inputNum이 
			if((inputNum-randomNum) >= 10) {
				System.out.println("입력하신 값은 너무 큽니다.");
			} else if((inputNum-randomNum) >= 5) {
				System.out.println("입력하신 값은 약간 큽니다.");
			} else if((inputNum-randomNum) >= 1) {
				System.out.println("입력하신 값은 아주 약간 큽니다.");
			} else if((inputNum-randomNum) <= -10) {
				System.out.println("입력하신 값은 아주 작습니다.");
			} else if((inputNum-randomNum) <= -5) {
				System.out.println("입력하신 값은 약간 작습니다.");
			} else if((inputNum-randomNum) <= -1) {
				System.out.println("입력하신 값은 아주 약간 작습니다.");
			} else {
				System.out.println("축하합니다. "+ tryCount +"번째 맞추셨습니다.");
			}
		} while(randomNum!=inputNum);
	}
	
	public static int getValidNumber() 
	{
		int inputNum = 0;
		
		do{
			//1. "1부터 100사이의 값을 입력하세요 : " 메시지를 화면에 출력하고,
				System.out.print(PROMPT_MESSAGE);
				inputNum = inputNumber();
				//2. 사용자로부터 숫자를 입력 받아 그 수를 리턴한다. 
//				System.out.println("입력받은 값 : " + inputNum);
			
			//3. 만약 사용자가 입력한 값이 숫자가 아니거나 1부터 100사이의 값이 아닌 경우,
			if(inputNum <= 100 && inputNum >= 1) {
				break; // 조건문을 빠져나간다.
			}  else {
				System.out.println("올바른 값을 입력하세요!!");
			}
		}
		//4. 올바른 숫자를 입력할 때까지 메시지를 출력하고 숫자를 입력 작업을 반복한다. 
		while(true);
	
		return inputNum;
	}
	
	// 이미 완성된 메서드
	public static int inputNumber() {
		String inputData = null;
	
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			inputData = in.readLine();
		
		} catch(Exception e) {
			return INVALID_INPUT;
		}
		
		return Integer.parseInt(inputData);
	}
	
	private static int getRandomNumber(int maxNum) {
		return new Random().nextInt(maxNum) + 1;
	}
}
