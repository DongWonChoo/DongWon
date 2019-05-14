package 생성자;

import java.util.Scanner;

public class 과제3_info {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		과제3_Member[] member = new 과제3_Member[3];
		int sum=0;
	
	for (int i = 0; i < member.length; i++) {
		System.out.print("id :");
		String id = sc.next();
		System.out.print("pw :");
		String pw = sc.next();
		System.out.print("user :");
		String user = sc.next();
		System.out.print("point :");
		int point = sc.nextInt();
		
		member[i] = new 과제3_Member(id, pw, user, point);
		sum = member[i].point + sum;
	}
	System.out.println();
	
	System.out.println("아이디     비밀번호    등급     마일리지");
	System.out.println("===========================");
	for (int i = 0; i < member.length; i++) {
		member[i].print();
	}
	
	System.out.println("회원부품을 만들어서(class로 만들었음. Member.Java)");
	System.out.println("각 객체를 만들어서 정보를 넣으세요.");
	System.out.println("다음과 같이 출력");
	System.out.println(member[0].id + "의 비밀번호는 " + member[0].pw + "입니다.");
	System.out.println(member[1].id + "는 " + member[1].user + "입니다.");
	System.out.println("총 마일리지는 " + sum + "입니다.");
	System.out.println("평균 마일리지는 " + sum/member.length + "입니다.");
	
	
	
	}
}
