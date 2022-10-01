package ucamp.java.mission8.entity;

import java.io.*;

public class Ship extends Vehicle {
	private int replacement;
	
	public Ship() {}
	
	public Ship(String modelName, int maxSpeed, int numberLimit, int replacement) {
		super(modelName, maxSpeed, numberLimit);
		this.replacement = replacement;
	}
	
	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}

	public void displayInfo(PrintWriter out) {
		super.displayInfo(out);
		out.println(" 배 수 량 : " + replacement + "톤");
	}
}
