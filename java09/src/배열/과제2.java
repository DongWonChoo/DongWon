package 배열;

import java.util.Scanner;

public class 과제2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] seat = new int[3][10];

		while (true) {
			System.out.println("-------------------------");
			System.out.print(" ");
			for (int i = 0; i < seat[0].length+1; i++) {
				System.out.print(i +1 + " ");
			}
			System.out.println();
			System.out.println("-------------------------");

			for (int i = 0; i < seat.length; i++) {
				System.out.print(i +1 + " ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + " ");
				}
				System.out.println();
			}
			System.out.print("종료0, 예약1>> ");
			int end = sc.nextInt();

			if (end == 0) {
				System.out.println("시스템 종료..");
				break;
			} else {
				System.out.print("행 입력(1~3) : ");
				int row = sc.nextInt();
				System.out.print("열 입력(1~!0) : ");
				int col = sc.nextInt();
				
				//예약 가능
				if(seat[row-1][col-1] == 0) {
					seat[row-1][col-1] = 1;
					System.out.println("예약 안료");
				} else {
					System.out.println("좌석을 다시 입력해주세요");
				}
			}			
		}
	}
}
