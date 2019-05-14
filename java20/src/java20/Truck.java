package java20;

public class Truck extends Car{
	String weight;
	int length;
	
	public Truck() {
		System.out.println("Æ®·° °´Ã¼ »ý¼Í..");
	}
	
	public Truck(String weight, int length) {
		super();
		this.weight = weight;
		this.length = length;
	}

	public Truck(String color, int speed, String weight, int length) {
		super(color, speed);
		this.weight = weight;
		this.length = length;
	}	
}
