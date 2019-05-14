package 일기장;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인 {
	private JTextField id;
	private JTextField pw;
	public 로그인() {
		//파일로 입력 출력 다 해보자 
		String[] Member = {"홍길동", "1234"};
		JFrame f = new JFrame("나의 일기장 로그인 화면");
		f.setSize(400, 500);
		
		
		JLabel l = new JLabel();
		ImageIcon icon = new ImageIcon("day.jpg");
		l.setIcon(icon);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		로그인 log = new 로그인();
		
		JButton button = new JButton("            새창            ");
		if(Member[0].equals(log.id.getText()) && Member[1].equals(log.pw.getText())) {
			String name = JOptionPane.showInputDialog(Member[0]);
			다이어리 diary = new 다이어리();
		}
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				다이어리 diory = new 다이어리();
			}
		});
		f.getContentPane().add(l);
		
		//id 입력
		JLabel lblNewLabel = new JLabel("ID 입력");
		f.getContentPane().add(lblNewLabel);
		id = new JTextField();
		f.getContentPane().add(id);
		id.setColumns(10);
		
		//pw 입력
		JLabel lblPw = new JLabel("PW 입력");
		f.getContentPane().add(lblPw);
		pw = new JTextField();
		pw.setColumns(10);
		f.getContentPane().add(pw);
		
		f.getContentPane().add(button);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		로그인 log = new 로그인();
		
	}
}
