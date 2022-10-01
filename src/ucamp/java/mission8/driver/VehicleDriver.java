package ucamp.java.mission8.driver;

import java.io.*;

import ucamp.java.mission8.controller.*;
import ucamp.java.mission8.exception.*;

public class VehicleDriver {
	final static String INPUT_FILE_NAME = "input.txt";
	final static String OUTPUT_FILE_NAME = "output.txt";
	
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(OUTPUT_FILE_NAME);
			
			VehicleManager vm = new VehicleManager(INPUT_FILE_NAME);
			
			vm.displayVehicles(new PrintWriter(System.out, true), ">> 재고 목록 <<");
			vm.displayVehicles(pw, ">> 재고 목록 <<");
			
			vm.sortByModelName();
			
			vm.displayVehicles(new PrintWriter(System.out, true), ">> 모델명으로 정렬된 재고 목록 <<");
			vm.displayVehicles(pw, ">> 모델명으로 정렬된 재고 목록 <<");
			
			pw.close();
		} catch(VehicleException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
