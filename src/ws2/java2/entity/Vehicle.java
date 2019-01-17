package ws2.java2.entity;

public class Vehicle {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private boolean available;
	
	public Vehicle(String modelName, int maxSpeed, int numberLimit) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
	}

	public String getModelName() {
		return modelName;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getNumberLimit() {
		return numberLimit;
	}
	
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" �� �� �� : " + this.modelName);
		System.out.println(" �ְ�ӵ� : " + this.maxSpeed + "km/h");
		System.out.println(" �ִ����� : " + this.numberLimit + "��");
	}
	
	
}
