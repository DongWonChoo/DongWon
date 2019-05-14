package java03;

import java.util.Scanner;

public class 자동차 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자동차의 속도는? : ");
		double speed = sc.nextDouble();
		System.out.print("자동차의 안정성은? : ");
		double safe = sc.nextDouble();
		System.out.print("자동차의 연비는? : ");
		double effi = sc.nextDouble();
		double total = (speed*0.5)+(safe*0.3)+(effi*0.2);
		
		System.out.println("자동차 성능 펑점은 : "+total);
		if(speed>=80 && safe >= 80 && effi >= 80) {
			System.out.println("	베스트!");
		}
		else if(total >= 80) {
			System.out.println("	우수!");
		}
		else if(total >= 70) {
			System.out.println("	보통!");
		}
		else {
			System.out.println("	불량");
		}
			
	}

}
