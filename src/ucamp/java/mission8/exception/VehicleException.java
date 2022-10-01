package ucamp.java.mission8.exception;

public class VehicleException extends Exception {
	private String message;
	
	public VehicleException() {}
	
	public VehicleException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
