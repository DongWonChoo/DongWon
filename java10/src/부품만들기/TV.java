package 부품만들기;

public class TV {
	//TV => class
	// - 정적특성 : 전원버튼유무, 사이즈, 색 => 멤버 변수
	boolean power;
	int size;
	String color;
	
	//- 동적특성 : 채널변경하다, 소리를조절하다, 잭연결하다. => 멤버 메소드
	
	public void changeCH() {
		System.out.println("채널 변경하다.");
	}
	
	public void sound() {
		System.out.println("소리를 조절하다");
	}

	public void connect() {
		System.out.println("잭을 연결하다.");
	}
	
	public String toString() {
		return power + " " + size + " " + color;
	}
}
