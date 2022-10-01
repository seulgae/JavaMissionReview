package ucamp.java.mission3.biz;

import ucamp.java.mission3.entity.*;

public class StudentBiz {
	private Student[] studentArr;
	public void loadStudentInfo() {
		//	이미 작성된 코드를 변경하여 Student 클래스 안에 작성된 생성자를 사용해 객체의 내용을 초기화한다.

		studentArr = new Student[6];
		studentArr[0] = new Student("S001", "홍길동", 23, 3.5);
		studentArr[1] = new Student("S002", "김삿갓", 26);
		studentArr[2] = new Student("S003", "장나라", 20, 4.2, "성적장학생");
		studentArr[3] = new Student("S004", "이순신", 28, 3.8, "근로장학생");
		studentArr[4] = new Student("S005", "도라에몽", 21, 3.2);	
		studentArr[5] = new Student("S006", "박나리", 20, 1.8, "유급");
		
		updateGradeRank();
	}
	
	private void updateGradeRank() {
		//	모든 Student 객체의 rank 변수가 학생의 석차를 갖도록 코드를 작성한다.
		//	일반적으로 이중 for문을 사용하지만 로직의 작성은 본인 자유이다.

	}
	
	public Student[] getStudentInfoArray() {
		//	studentArr 배열을 반환한다.
		return studentArr;
	}
	
	public void getStudentInfoArraySortedByGrade() {
		//	studentArr 배열을 복사하기 위해 새로운 배열을 생성한 후, 
		//	System.arraycopy() 메서드를 활용해 기존 배열의 요소의 값을 모두 새로운 배열로 복사한다.
		//	새 배열에 대해서 성적을 기준으로 내림차순으로 정렬한 후, 새 배열의 위치를 반환한다.

		return;
	}
	
	public double getAvgScore() {
		//	배열에 등록된 모든 학생 객체에 대해서 평균 학점을 구한 후 반환한다.

		return 0.0;
	}
}
