package java03;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class 다이얼로그 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "내가 바로 다이얼로그예요");
		String name =JOptionPane.showInputDialog("당신의 이름을 입력하세요");
		System.out.println("당신의 이름은 : " + name);
		String age = JOptionPane.showInputDialog("나이을 입력하세요");
		int data = Integer.parseInt(age);
		JOptionPane.showMessageDialog(null, "내년 내 나이는 "+(data +1)+"입니다");
		
	}
}