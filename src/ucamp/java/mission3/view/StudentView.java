package ucamp.java.mission3.view;

import ucamp.java.mission3.biz.*;
import ucamp.java.mission3.entity.*;

public class StudentView {
	StudentBiz biz;
	
	public void processStudentInfo() {
	biz = new StudentBiz();
		
		biz.loadStudentInfo();
		
		displayStudentInfo("# 학생 정보 목록 (기본) #", biz.getStudentInfoArray());
		
		displayStudentInfo("# 학생 정보 목록 (성적순) #", biz.getStudentInfoArraySortedByGrade());
		
		displayStudentAvgScore(biz.getAvgScore());
	}
	
	private void displayStudentInfo(String title, Student[] studentArr) {
		System.out.println(title);
		Student.printSeperator();
		Student.printHeader();
		Student.printSeperator();
		
		for(Student s : studentArr) {
			s.printLine();
		}
		Student.printSeperator();
		System.out.println();
		//	파라미터로 받은 학생 배열을 이용하여 모든 학생의 정보를 목록으로 출력하는 코드를 작성한다. 
		//	출력 내용은 스펙의 Sample Run을 참조한다.
	}
	
	private void displayStudentAvgScore(double avgScore) {
		System.out.println();
		System.out.println("학생 평균 학점: " + avgScore);
	}
}
