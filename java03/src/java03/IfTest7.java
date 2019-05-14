package java03;

import java.util.Scanner;

public class IfTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------");
		System.out.print("학점을 입력하세요 : ");
		int num = sc.nextInt();
		
		String result;
		if(num >= 90) {
			result = "A";
		}
		else if(num >= 80){
			result = "B";
		}
		else if(num >= 70){
			result = "C";
		}
		else if(num >= 60){
			result = "D";
		}
		else {
			result = "F";
		}
		System.out.println("당신의 학점은 "+result+"입니다.");
	}
}
