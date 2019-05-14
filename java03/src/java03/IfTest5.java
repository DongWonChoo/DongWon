package java03;

import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------");
		System.out.print("첫번째 수를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("---------------");
		System.out.print("두번째 수를 입력하세요");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("---------------");
			System.out.println("첫번째 수"+num1+"가 더 큽니다");
		}
		else{
			System.out.println("---------------");
			System.out.println("두번째 수"+num2+"가 더 큽니다");
		}
	}
}
