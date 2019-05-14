package 반복문;

import java.util.Scanner;

public class 과제2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("6번문제");
		while(true) {
		System.out.print("숫자 입력 : ");
		int num4 = sc.nextInt();
		int temp = 0;
			switch(num4) {
			case 1 : System.out.println("봄"); if(num4 == 1) {temp = 1;} break;
			case 2 : System.out.println("봄"); if(num4 == 2) {temp = 1;} break;
			case 3 : System.out.println("봄"); if(num4 == 3) {temp = 1;} break;
			case 4 : System.out.println("봄"); if(num4 == 4) {temp = 1;} break;
			}
			if(temp == 1) {
				break;
			}
		}
	}
}
