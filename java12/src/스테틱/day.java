package ½ºÅ×Æ½;

public class day {
	String Doing;
	int time;
	String location;
	static int count;
	static int total;
	
	public day(String doing, int time, String location) {
		this.Doing = doing;
		this.time = time;
		this.location = location;
		count ++;
		total+= time;
	}
	
	public int getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return Doing + "    " + time + "     " + location;
	}
}
