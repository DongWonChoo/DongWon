package 배열;

import java.util.Scanner;

public class 극장예매시스템 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int[] seat = new int[10];
		while(true) {
			System.out.println("==========================================");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " " );
			}
			System.out.println();
			System.out.println("==========================================");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("==========================================");
			System.out.println("종료는 X, 예매는 O >>");
			String end = sc.next();
			if(end.equals("x") || end.equals("X") ) {
				System.out.println("예매 시스템을 종료 하겠습니다.");
				break;
			}
			System.out.println("예매할 좌석 번호 입력 : " );
			int input = sc.nextInt();
			if(seat[input-1] != 1) {
				seat[input-1] = 1;
				System.out.println("좌석 예매 완료");
			} else {
				System.out.println("이미 예매된 좌석입니다.");
			}
			int count=0;
			for (int i = 0; i < seat.length; i++) {
				if(seat[i]==1) {
					count++;
				}
			}
			System.out.println("결제금액 : " + (count * 10000));
			System.out.println("좌석 예매 수 : " + count);
			
			
		}
	}
}
