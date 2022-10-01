package ucamp.java.mission3.entity;

public class Student {
	public String studentNo;
	public String name;
	public int age;
	public double grade;
	public String note;
	public int rank;
	
	//	기본생성자 1개와 맴버 변수를 초기화 하기 위한 3개의 생성자의 추가한다.
	//	각 생성자는 필요에 따라 다른 생성자를 호출하여 중복된 코드를 최소화해야 한다.

	
	public static void printHeader() {
		System.out.println("학번\t이름\t나이\t학점\t석차\t비고");
	}
	
	public static void printSeperator() {
		System.out.println("------------------------------------------------");
	}
	
	public void printLine() {
		//	맴버 변수의 값을 한 줄로 출력하는 기능을 구현한다.
		
	}
}
