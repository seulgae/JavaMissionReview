package ucmap.java.mission5.driver;

import ucmap.java.mission5.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles(">> 재고 목록 <<");
		vm.sortByModelName();
		vm.displayVehicles(">> 모델명으로 정렬된 재고 목록 <<");
	}
}