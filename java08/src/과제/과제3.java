package 과제;

import java.util.Scanner;

public class 과제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] age = new int[5];
		int count = 0;
		
		System.out.println("이름과 나이를 입력하세요.");
		for (int i = 0; i < age.length; i++) {
			System.out.print("입력 : ");
			name[i] = sc.next();
			age[i] = sc.nextInt();
			count++;
		}
		System.out.print("전체 인원 수 : " + count);
		System.out.println();
		
		int sum = 0;
		System.out.println("파티 참석자 전체 명단입니다.");
		for (int i = 0; i < age.length; i++) {
			System.out.print("이름은 : " + name[i] + ", ");
			System.out.print("나이는 : " + age[i]);
			System.out.println();
			sum = age[i] + sum;
		}

		int avg = sum/name.length;
		System.out.println("파티 참석자 나이의 평균 : " + avg + "세");
		
		
		
		
		
	}
}














