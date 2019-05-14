package java17;

public class SuperMan extends Man {
	//沥利 加己
	boolean fly;
	
	//悼利 加己
	public void flyspeed() {
		sleep();
		System.out.println("500栏肺 朝促.");
		
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", eye=" + eye + ", height=" + height + ", weight=" + weight + "]";
	}
}
