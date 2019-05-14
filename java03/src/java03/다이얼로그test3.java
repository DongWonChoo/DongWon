package java03;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class 다이얼로그test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("내 나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("동생의 나이를 입력하세요 : ");
		int age2 = sc.nextInt();
		
		if(age >= age2) {
			System.out.println("내가 떡을 2개 먹어요.");
		}else
			System.out.println("동생이 떡을 2개 먹어요.");
	}
}