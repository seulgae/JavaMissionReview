package ucamp.java.mission8.controller;

import java.util.*;

import ucamp.java.mission8.entity.*;
import ucamp.java.mission8.exception.*;

import java.io.*;

public class VehicleManager {
	ArrayList<Vehicle> vehicleList;
	
	public VehicleManager(String filenName) throws VehicleException {
		BufferedReader in = null;
		String oneLine = null;
		vehicleList = new ArrayList<Vehicle>();
		
		//TODO
	}
	
	public void displayVehicles(PrintWriter out, String title) {
		//TODO
	}
	
	public void sortByModelName() {
		for (int inx = 0 ; inx < vehicleList.size() - 1 ; inx++) {
			for (int jnx = inx + 1 ; jnx < vehicleList.size() ; jnx++) {
				if (vehicleList.get(inx).getModelName().compareTo(vehicleList.get(jnx).getModelName()) > 0) {
					Vehicle temp = vehicleList.get(inx);
					vehicleList.set(inx, vehicleList.get(jnx));
					vehicleList.set(jnx, temp);
				}
			}
		}
	}
}

