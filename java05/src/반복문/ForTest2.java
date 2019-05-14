package 반복문;

import java.util.Scanner;

public class ForTest2 {
	public static void main(String[] args) {
		System.out.println("1번문제");
		int count = 0;
		for(int i=0 ; i <20 ; i++) {
			count++;
			System.out.println(count + " Hello Java");
		}
		
		System.out.println("2번문제");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		count = 0 ;
		for(int i=0 ; i<num ; i++) {
			count++;
			System.out.println(count + "★");
		}
		
		System.out.println("3번문제");
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("세 숫자 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		System.out.println("세 수의 합 : " + (num1+num2+num3));
		
		System.out.println("3\4번문제");
		
	}
}
