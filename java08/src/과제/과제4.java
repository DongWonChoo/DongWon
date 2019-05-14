package 과제;

import java.util.Scanner;

public class 과제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] code = new int[5];
		int count = 1;
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1)강원도  2)전라도  3)파주  4)제주도  5)충청도");
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
				if(code[num-1] > 1) {
					System.out.println("신청 불가능 합니다.");
					System.out.println("다른 코드 번호를 입력해주세요.");
					count = 1 ;
				} else {
					code[num-1] = count;
					count ++;
				}
			}
		}
	}
}
