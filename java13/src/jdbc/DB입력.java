package jdbc;

import java.util.Scanner;

public class DB입력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====회원 가입 정보 입력====");
		System.out.print("ID");
		String id = sc.next();
		System.out.print("PW");
		String pw = sc.next();
		System.out.print("이름");
		String name = sc.next();
		System.out.print("연락처");
		String tel = sc.next();
		
		DB처리  db = new DB처리();
		MemberDTO dto = new MemberDTO();
		try {
			db.insert(dto);
		} catch (Exception e) {
			System.out.println("에러발생!");
			e.printStackTrace();
		}
	}
}
