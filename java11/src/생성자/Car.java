package 생성자;

public class Car {
	//정적속성
	String color;
	boolean convertible;
	
	public Car() {
		//생성자는 자동 초기화 하고 실행시 한번만 불러온다.
		System.out.println("객체생성시 초기화할 처리를 실행..");
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	//alt + shift + f + o  자동 생성 단축키
	public Car(String color, boolean convertible) {
		//이거슨 지역변수
		this.color = color;
		this.convertible = convertible;
	}	
	

	//동적속성
	public void change() {
		System.out.println("기어를 변속하다.");
	}
	
	//현재 속도 입력 받기
	public int speedUp(int nowSpeed) {
		//현재 속도 + 30 입력하기 
		return nowSpeed + 30;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", convertible=" + convertible + "]";
	}
	
}
