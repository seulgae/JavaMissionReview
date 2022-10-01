//알파코드 :      이 름 :
//아래 클래스 Employee를 캡슐화시키고, main() 메서드 안에서 Employee 객체를 생성하는 기존 코드를 수정하시오.

package q04;

class Employee {
	String empNo;
	String name;
	int age;
	String hiredDate;
	
	void displayInfo() {
		System.out.println("사원번호 : " + empNo);
		System.out.println("이   름  : " + name);
		System.out.println("나   이  : " + age);
		System.out.println("입사일자 : " + hiredDate);
	}
}

public class MyTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.empNo = "1111";
		emp.name = "백상어";
		emp.age = 41;
		emp.hiredDate = "2007-03-01";
		
		emp.displayInfo();
	}
}
