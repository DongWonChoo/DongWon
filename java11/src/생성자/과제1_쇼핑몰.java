package 생성자;

import java.util.Scanner;

public class 과제1_쇼핑몰 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		과제1_Member[] mem = new 과제1_Member[3];

		System.out.println("가입할 정보를 입력해주세요.");
		for (int i = 0; i < mem.length; i++) {
			System.out.print("가입할 이름 : ");
			String name = sc.next();
			System.out.print("가입할 나이 : ");
			int age = sc.nextInt();
			System.out.print("가입할 연락처 : ");
			String tel = sc.next();
			System.out.print("가입할 주소 : ");
			String addr = sc.next();
			System.out.println();
			
			mem[i] = new 과제1_Member(name, age, tel, addr);						
		}	
		
		System.out.println("===============================");
		System.out.println("이름          나이           연락처           주소");
		System.out.println("===============================");
		
		for (int i = 0; i < mem.length; i++) {
			mem[i].user();
		}
	}
}
