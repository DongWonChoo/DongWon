package 생성자;

import java.util.Scanner;

public class 과제2_Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		과제2_Member[] member = new 과제2_Member[3];
		int sum=0;
	
	for (int i = 0; i < member.length; i++) {
		System.out.print("상품명 product");
		String product = sc.next();
		System.out.print("예금주 name");
		String name = sc.next();
		System.out.print("예금액money");
		int money = sc.nextInt();
		
		member[i] = new 과제2_Member(product, name, money);
		sum = member[i].money + sum;
	}
	System.out.println();
	
	System.out.println("상품명 product     예금주 name     예금액money");
	System.out.println("=========================================");
	if(member[1].product.equals("내비상금")) {
		System.out.println(member[1].product + "통장에는 " + member[1].money + "만원이" + "들어있어요.");
		}
		if(member[2].name.equals("박아무개")) {
			System.out.println(member[2].name + "통장에는 " + member[2].money + "만원이" + "들어있어요.");
		}
		System.out.println();
		System.out.println("우리 집 전체 예금액은 " + sum + "만원 이에요.");
	}
}
