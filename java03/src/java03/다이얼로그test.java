package java03;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class 다이얼로그test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("오늘 치킨 가격이 얼마인가요? : ");
		int pr = sc.nextInt();
		
		if(pr > 9000) {
			System.out.println("내일 다시 전화할께요.");
		}else {
			System.out.println("주문할께요");
		}
	}
}