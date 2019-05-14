package 반복문;

import java.util.Scanner;

public class WhileTeste3 {
	public static void main(String[] args) {
		//두 개의 입력값을 받아서, 첫번째값부터 두번째 값까지 더합
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 1: ");
		int num1 =sc.nextInt();
		System.out.println("숫자 입력 2: ");
		int num2 =sc.nextInt();
		
		int sum = 0;
		
		while(num1 <= num2) {
			sum = sum + num1;
			num1++;
		}
		System.out.println(sum);
	}
}
