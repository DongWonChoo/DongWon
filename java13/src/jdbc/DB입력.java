package jdbc;

import java.util.Scanner;

public class DB�Է� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====ȸ�� ���� ���� �Է�====");
		System.out.print("ID");
		String id = sc.next();
		System.out.print("PW");
		String pw = sc.next();
		System.out.print("�̸�");
		String name = sc.next();
		System.out.print("����ó");
		String tel = sc.next();
		
		DBó��  db = new DBó��();
		MemberDTO dto = new MemberDTO();
		try {
			db.insert(dto);
		} catch (Exception e) {
			System.out.println("�����߻�!");
			e.printStackTrace();
		}
	}
}
