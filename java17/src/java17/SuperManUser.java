package java17;

public class SuperManUser {
	public static void main(String[] args) {
		SuperMan sMan = new SuperMan();
		sMan.height = 200;
		sMan.weight = 100;
		sMan.eye = 3;
		sMan.fly = true;
		System.out.println(sMan);
		sMan.eat();
		sMan.sleep();
		sMan.army();
		sMan.flyspeed();
	}
}
