package 부품만들기;

import java.util.Scanner;

public class 계산기 {
	Scanner sc = new Scanner(System.in);
	//자바는 메소드 이름을 동이랗게 할 수 있다.
	//하나의 일므으로 동일한 기능을 표현하게 하는 기능.
	//다형성(overloading, 오버로딩)
		
	//add(100,200)
	public int add(int x, int y) {
		return x + y;
	}
	
	//add(200,11.11)
	public void add(int x, double y) {
		System.out.println(x + y );
	}
	
	//add("홍길동" ,1000) : ok
	//add(1000, "홍길동") : X
	//add("홍길동") : X
	//입력값의 개수, 타입, 순사가 중요!!
	public void add(String x, double y) {
		System.out.println(x + y );
	}
}
