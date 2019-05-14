package java03;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class 다이얼로그test2 {

	public static void main(String[] args) {
		
		String food =JOptionPane.showInputDialog("먹고 싶은 음식을 입력하세요");
		String food2 = JOptionPane.showInputDialog("먹기 싫은 음식을 입력하세요");
		System.out.println("먹고 싶은 음식은 : " +food+ "  먹기 싫은 음식은 : "+food2);
		
	}
}