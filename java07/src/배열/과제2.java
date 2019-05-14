package 배열;

import java.util.Scanner;

public class 과제2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] player = new String[3];
		for (int i = 0; i < player.length; i++) {
			System.out.print("가수 이름 입력: ");
			player[i] = sc.next();
		}
		
		for (int i = 0; i < player.length; i++) {
			if(i>0) {
				System.out.print(",");
			}
			System.out.print(player[i]);	
		}
		System.out.println();
		System.out.println();
		
		String temp = null;
		int a	 = 0;
		int b	 = 0;
		int c	 = 0;
		
		while(true) {
			for (int i = 0; i < player.length; i++) {
				System.out.print((i+1) + ")" + player[i] + "  ");			
			}
			System.out.print("투표번호 >>");
			temp = sc.next();
			
			if(temp.equals("1")) {
				a++;
			} else if (temp.equals("2")) {
				b++;
			} else if (temp.equals("3")) {
				c++;
			} else {
				System.out.println("종료");
				break;
			}
		} 
		for (int i = 0; i < player.length; i++) {
			System.out.print((i+1) + ")" + player[i] + " ");
			if(i == 0) {
				System.out.println(a + "표  ");
			} 
			if(i == 1) {
				System.out.println(b+ "표  ");
			}
			if(i == 2) {
				System.out.println(c+ "표  ");
			}
		}
	}
}
