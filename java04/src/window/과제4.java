package window;

import java.util.Random;
import java.util.Scanner;

public class 과제4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int temp= 0;
		
		Random random = new Random();
		
		while(true) {
			a = sc.nextInt();
			if(a == 0) {
				System.out.print("가위 vs ");
			} else if (a ==1) {
				System.out.print("바위 vs ");
			} else {
				System.out.print("보 vs ");
			}
			
			
			//System.out.print("vs");
			
			temp = random.nextInt(2);
			
			if(temp == 0) {
				System.out.print("가위");
			} else if (temp ==1) {
				System.out.print("바위");
			} else {
				System.out.println("보");
			}		
			
			if(a == 3) {
				break;
			}
		}
		
	}
}
