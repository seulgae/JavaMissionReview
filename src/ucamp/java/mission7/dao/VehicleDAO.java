package ucamp.java.mission7.dao;

import java.util.ArrayList;
import ucamp.java.mission7.entity.*;

public class VehicleDAO {
	public static final int NONE = 0;
	public static final int AIRPLANE = 1;
	public static final int CAR = 2;
	public static final int SHIP = 3;
	
	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public ArrayList<Vehicle> getAll() {
		return vehicleList;
	}
	
	public ArrayList<Vehicle> getAll(int type) {
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		
		//------------------------------------------------------------------------
		// TODO: type에 따라 특정 유형의 운송수단 목록을 컬렉션으로 반환하는 코드를 아래에 작성하시오.
		//       type 설명:  NONE(0) 		- 전체
		//                  AIRPLANE(1) - 비행기
		//                  CAR(2)      - 자동차
		//                  SHIP(3)     - 선박
		//------------------------------------------------------------------------

		
		
		
		return list;
	}
	
	public Vehicle get(String serialNo) {
		//------------------------------------------------------------------------
		// TODO: 일련번호가 일치하는 운송수단을 찾아 반환하는 코드를 아래에 작성하시오.
		//       (일치하는 운송수단이 존재하지 않는 경우, null을 반환)
		//------------------------------------------------------------------------

		
		
		
		return null;
	}
	
	public Vehicle get(int inx) {
		//------------------------------------------------------------------------
		// TODO: 매개변수 inx를 인덱스로 하는 운송수단을 찾아 반환하는 코드를 아래에 작성하시오.
		//------------------------------------------------------------------------
		
		
		
		return null;
	}
	
	public void add(Vehicle vehicle) {
		//------------------------------------------------------------------------
		// TODO: 운송수단을 컬렉션에 추가하는 코드를 아래에 작성하시오.
		//------------------------------------------------------------------------
	
	
	}
	
	public void add(ArrayList<Vehicle> list) {
		//-------------------------------------------------------------------------------------
		// TODO: 매개변수로 받은 list 컬렉션의 모든 객체를 vehicleList 컬렉션에 추가하는 코드를 아래에 작성하시오.
		//-------------------------------------------------------------------------------------
	
	
	}
	
	public boolean update(Vehicle vehicle) {
		//-------------------------------------------------------------------------------------
		// TODO: 매개변수로 받은 vehicle 객체와 같은 일련번호를 갖는 객체를 찾아 교체하는 코드를 아래에 작성하시오.
		//       (성공 시 true를 반환하고, 같은 일련번호를 갖는 객체가 없는 경우 false를 반환)
		//-------------------------------------------------------------------------------------
		
		
		
		return false;
	}
	
	public boolean delete(String serialNo) {
		//-------------------------------------------------------------------------------------
		// TODO: 매개변수로 받은 일련번호와 일치하는 객체를 찾아 삭제하는 코드를 아래에 작성하시오.
		//       (성공 시 true를 반환하고, 같은 일련번호를 갖는 객체가 없는 경우 false를 반환)
		//-------------------------------------------------------------------------------------
		
		
		
		return false;
	}
}
