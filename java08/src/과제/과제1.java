package 과제;

import java.util.Scanner;

public class 과제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] code = new int[5];
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1)jaa  2)스프링  3)안드로이드  4)파이썬  5)제이쿼리");
			System.out.println("-----------------------------------------");
			for (int i = 0; i < code.length; i++) {
				System.out.print(code[i] + "        ");
			}
			System.out.println("");
			System.out.println("=========================================");
			System.out.println("원하는 과목코드를 입력해주세요.(종료 0) ==>");
			int num =sc.nextInt();
			if(num == 0) {
				System.out.println("종료");
				break;
			} else if(num > 5) {
				System.out.println("수강 항목이 없습니다.");
			} else {
				if(code[num-1] != 0) {
					System.out.println("신청 불가능 합니다.");
					System.out.println("다른 코드 번호를 입력해주세요.");
				} else {
					code[num-1] = 1;	
				}
			}
		}
	}
}
