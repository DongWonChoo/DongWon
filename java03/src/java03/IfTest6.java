package java03;

import java.util.Random;
import java.util.Scanner;

public class IfTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int target = random.nextInt(100);
		System.out.println("---------------");
		int count = 0;
		
		while(true) {
			count = count+1;
			System.out.println("당신이 생각한 숫자를 입력하시오.");
			int num = sc.nextInt();
			
			if(num==target) {
				System.out.println("정답입니다. 시도한 횟수는"+count);
				break;
			}
			else if(num>target) {
				System.out.println("정답보다 너무 커요");
			}
			else if(num<target) {
				System.out.println("정답보다 너무 작아요"); 
			}

			if(count==5) {
				System.out.println("한도초과");
				break;
			}
		}
	}
}

