package ws2.java2.entity;

public class Ship extends Vehicle{

	public Ship(String modelName, int maxSpeed, int numberLimit, int replacement) {
		super(modelName, maxSpeed, numberLimit);
		this.replacement = replacement;
	}

	private int replacement;
	
	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" ¹è ¼ö ·® : " + replacement + "Åæ");
	}


}
