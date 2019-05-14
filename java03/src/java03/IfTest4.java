package java03;

import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------");
		System.out.print("첫번째 수를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("---------------");
		System.out.print("두번째 수를 입력하세요");
		int num2 = sc.nextInt();
		
		int plus = num1 + num2;
		double minus = num1 - num2;
		int x = num1 * num2;
		double n = num1 / num2;
		System.out.println("덧셈은 :"+plus+"뺄셈은 :"+  minus+"곱셈은 :"+ x+"나눗셈은 :"+ n);
	}
}
