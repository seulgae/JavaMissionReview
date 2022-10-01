package ucamp.java.mission7.view;

import ucamp.java.mission7.dao.*;
import ucamp.java.mission7.entity.*;

public class VehicleTest {
	public static void main(String[] args) {
		//---------------------------------------------
		// TODO: 아래 코드를 Singleton 패턴을 적용하도록 수정하시오 
		//---------------------------------------------
		VehicleDAO dao = new VehicleDAO();
		
		
		
		
		dao.add(new Airplane("A001", "보잉747", 1300, 300, 4));
		dao.add(new Airplane("A002", "F-16", 1600, 1, 1));
		dao.add(new Car("C001", "소나타3", 180, 5, 10));
		dao.add(new Car("C002", "티코", 130, 4, 15));
		dao.add(new Car("C003", "스타렉스", 150, 10, 11));
		dao.add(new Ship("S001", "크루즈2", 30, 400, 35000));
		dao.add(new Ship("S002", "노틸러스", 25, 150, 15000));
		
		System.out.println("1. 전체 운송수단 목록 출력");
		//---------------------------------------------
		// TODO: 전체 운송수단 목록을 출력하는 코드를 아래에 작성하시오.
		//---------------------------------------------
		
		
		
		
		System.out.println("\n2. \"C002\"인 운송수단 정보 출력");
		//-------------------------------------------------------------
		// TODO: 일련번호가 "C002"인 운송수단 정보를 출력하는 코드를 아래에 작성하시오.
		//-------------------------------------------------------------
		
		
		
		
		System.out.println("\n3. 수정 후 정보 출력");
		//-------------------------------------------------------------------------
		// TODO: 일련번호가 "C002"인 운송수단의 모델명을 "스파크", 최고속력을 150, 정원을 5, 연비를 12로 
		//       수정 후 정보 출력하는 코드를 아래에 작성하시오.
		//-------------------------------------------------------------------------
		
		
		
		
		System.out.println("\n4. 일련번호가 \"S002\"인 운송수단을 관리 목록에서 제거");
		//-------------------------------------------------------------------------
		// TODO: 일련번호가 "S002"인 운송수단을 관리 목록에서 제거하는 코드를 아래에 작성하시오.
		//-------------------------------------------------------------------------

		
		
		
		System.out.println("\n5. 전체 비행기 목록만 출력");
		//-----------------------------------------------
		// TODO: 전체 선박 목록을 출력하는 코드를 아래에 작성하시오.
		//-----------------------------------------------

		
		
		
		System.out.println("\n6. 일련번호가 \"C004\"인 자동차를 모델명을 \"쏘렌토\", 최고속력을 180, 정원을 6, 연비를 11로 신규 추가");
		//------------------------------------------------------------------------
		// TODO: 일련번호가 "C004"인 자동차를 모델명을 "쏘렌토", 최고속력을 180, 정원을 6, 연비를 
		//       11로 신규 추가하는 코드를 아래에 작성하시오.
		//------------------------------------------------------------------------
		
		
		
		
		System.out.println("\n7. 전체 자동차 목록만 출력");
		//-----------------------------------------------
		// TODO: 전체 자동차 목록 출력하는 코드를 아래에 작성하시오.
		//-----------------------------------------------

		
		
		
		
		System.out.println("\n8. 전체 비행기 목록만 출력");
		//-----------------------------------------------
		// TODO: 전체 비행기 목록 출력하는 코드를 아래에 작성하시오.
		//-----------------------------------------------
		
		
		
		
	}
}
