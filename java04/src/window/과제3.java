package window;

import java.util.Date;
import java.util.Scanner;

public class 과제3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("등급 입력 : ");
		String input =  sc.next();
		char grade = ' ';
		grade = input.charAt(0);
		
		if(grade == 'A') {
			 System.out.println("최우수입니다.");
		} else if( grade == 'B') {
			System.out.println("우수입니다.");
		}else if (grade == 'C') {
			System.out.println("보통입니다.");
		} else {
			System.out.println("통과하지 못했습니다.");
		}
	}
}
