package jdbc;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DB�Է�2 {
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
				id = JOptionPane.showInputDialog("ID�Է�");
				pw = JOptionPane.showInputDialog("pw�Է�");
				name = JOptionPane.showInputDialog("name�Է�");
				tel = JOptionPane.showInputDialog("tel�Է�");
				DBó��  dbi = new DBó��();
				try {
					dbi.insert(dto);
					System.out.println();
				} catch (Exception e) {
					System.out.println("�����߻�!");
					e.printStackTrace();
				}
				break;
			case 2 : 
				id = JOptionPane.showInputDialog("ID�Է�");
				tel = JOptionPane.showInputDialog("tel�Է�");
				DBó��  dbu = new DBó��();
				try {
					dbu.update(id, tel);
					System.out.println();
				} catch (Exception e) {
					System.out.println("�����߻�!");
					e.printStackTrace();
				}
				break;
			case 3 : 
				id = JOptionPane.showInputDialog("ID�Է�");
				DBó��  dbd = new DBó��();
				try {
					dbd.delete(id);
					System.out.println();
				} catch (Exception e) {
					System.out.println("�����߻�!");
					e.printStackTrace();
				}
				break;
			case 4 :
				break;
			default :
				System.out.println("1~4 ��������");
			}
			if(select == 4) {
				break;
			}
		}
	}
}
