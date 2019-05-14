package java03;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		/* 오늘 아침에 대한 정보 출력
		 * ------------------
		 * 오늘 아침을 먹고 왔나요?
		 * 
		*/
		boolean BF = true;
		String bus = "2호선";
		double yd = 10.5;
		double td = 9;
		double dw = 5.5;
		String team = "홍길동";
		
		System.out.println("오늘 아침을 먹고 왔나요?"+BF);
		
		System.out.println("오늘 타고온 버스의 번호나 지하철 노선은?"+bus);
		
		System.out.println("오늘은 어제("+yd+")보다"+dw+"도 낮아요, 오늘의 온도는 :"+td);
		
		System.out.println("오늘부터 함께할 우리 조원의 이름은?"+team);
		

	}

}
