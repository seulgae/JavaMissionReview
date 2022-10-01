package ucamp.java.mission6.driver;

import ucamp.java.mission6.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		
		vm.displayVehicles1(">> 재고 목록 <<");
		vm.sortByModelName();
		vm.displayVehicles2(">> 모델명으로 정렬된 재고 목록 <<");
		
		//vm.displayVehicles(">> 비행기 재고 목록 <<", X);
		//vm.displayVehicles(">> 자동차 재고 목록 <<", X);
		//vm.displayVehicles(">> 선박 재고 목록 <<", X);
	}
}
