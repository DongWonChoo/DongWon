package 반복문;

import java.util.Scanner;

public class 과제1 {
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
		
		System.out.println("4번문제");
		System.out.println("단어 입력 : ");
		String word1 = sc.next();
		String word2 = sc.next();
		System.out.println("★★" + word1 + " " + word2 + "★★");
		
		System.out.println("5번문제");
		for(int i=0 ; i<10 ; i++) {
			for(int j=0 ; j<10 ; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}

		System.out.println("6번문제");
		while(true) {
		System.out.print("계절 숫자 입력 : ");
		int num4 = sc.nextInt();
		int temp = 0;
			switch(num4) {
			case 1 : System.out.println("봄"); if(num4 == 1) {temp = 1;} break;
			case 2 : System.out.println("여름"); if(num4 == 2) {temp = 1;} break;
			case 3 : System.out.println("가을"); if(num4 == 3) {temp = 1;} break;
			case 4 : System.out.println("겨울"); if(num4 == 4) {temp = 1;} break;
			}
			if(temp == 1) {
				break;
			}
		}
		sc.close();
	}
}
