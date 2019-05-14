package 부품만들기;

public class 거실 {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.company = "사과";
		p1.shape = "네모";
		p1.size = 11;
		System.out.println(p1);
		System.out.println("------------");
		
		//메소드 사용(call, 부른다).
		String name = p1.call();
		System.out.println(name + "과 통화를 하다.");
		System.out.println(p1.call());
		
		//void형의 메소드를 호출한 경우에는
		//리턴받은 값이 없으므로
		// 변수에 넣어줄 수도 없고,
		//프린트 해줄 수 도 없다.
		
		int time = p1.alram();
		System.out.println(p1.alram() + "시");
		
		
	}
}
