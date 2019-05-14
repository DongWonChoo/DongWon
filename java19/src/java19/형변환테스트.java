package java19;

public class 형변환테스트 {
	public static void main(String[] args) {
		byte a  = 127 ;
		int b = a;
		
		int c = 127;
		byte d =  (byte)c;
		
		//참조형 형변환(클래스의 형변환)
		//상속관계에 있는 클래스들만 형변환 가능
		//작(자식) -> 큰(부모) : 자동형 변환 -> up캐스팅
//		Car car = new Car(); //부모(크다)
//		Truck truck = new Truck(); //자식(작다)
//		car = truck;//가능
//		//큰(부모) ->작(자식) : 강제형변환 ->  down캐스
//		truck = car; //불가능
	}
	
}
