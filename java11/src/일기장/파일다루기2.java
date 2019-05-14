package 일기장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일다루기2 {
	public static void main(String[] args) throws Exception {
		//파일에 저장
		//객체 생성
		//메소드 사용
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화 입력");
		String addr = JOptionPane.showInputDialog("주소 입력");
		FileWriter w = new FileWriter(name + ".txt");
		//메소드 호출 -> 기본생성자가 없기에 파라미터 값 입력
		w.write(name + "\n");
		w.write(tel + "\n");
		w.write(addr + "\n");
		
		w.close();
	}
}
