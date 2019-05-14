package 생성자;

public class Tour {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "검정색";
		car1.convertible = true;
		System.out.println(car1);
		car1.change();
		int exSpeed = car1.speedUp(50);
		
		System.out.println(exSpeed);
				
		System.out.println();
		
		Car car2 = new Car("빨강색", false);
		System.out.println(car2);
		
		//생성자를 여러개 만들 수 있다. 오버로딩!
		Car car3 = new Car("파랑색");
		System.out.println(car3);
	}
}
