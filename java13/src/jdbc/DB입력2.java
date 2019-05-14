package jdbc;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DB입력2 {
	public static void main(String[] args) {
		String id=null;
		String pw=null;
		String name=null;;
		String tel=null;;
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setTel(tel);
		int stop;
			
		while(true) {
			String num = JOptionPane.showInputDialog("1.Insert 2.Update 3.Delete 4.out");
			int select = Integer.parseInt(num);
			switch(select) {
			case 1: 
				id = JOptionPane.showInputDialog("ID입력");
				pw = JOptionPane.showInputDialog("pw입력");
				name = JOptionPane.showInputDialog("name입력");
				tel = JOptionPane.showInputDialog("tel입력");
				DB처리  dbi = new DB처리();
				try {
					dbi.insert(dto);
					System.out.println();
				} catch (Exception e) {
					System.out.println("에러발생!");
					e.printStackTrace();
				}
				break;
			case 2 : 
				id = JOptionPane.showInputDialog("ID입력");
				tel = JOptionPane.showInputDialog("tel입력");
				DB처리  dbu = new DB처리();
				try {
					dbu.update(id, tel);
					System.out.println();
				} catch (Exception e) {
					System.out.println("에러발생!");
					e.printStackTrace();
				}
				break;
			case 3 : 
				id = JOptionPane.showInputDialog("ID입력");
				DB처리  dbd = new DB처리();
				try {
					dbd.delete(id);
					System.out.println();
				} catch (Exception e) {
					System.out.println("에러발생!");
					e.printStackTrace();
				}
				break;
			case 4 :
				break;
			default :
				System.out.println("1~4 선택하자");
			}
			if(select == 4) {
				break;
			}
		}
	}
}
