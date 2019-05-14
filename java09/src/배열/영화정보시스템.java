package 배열;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화정보시스템 {
	public static void main(String[] args) {
		String[] movies = {"m1.PNG","m2.PNG","m3.PNG","m4.PNG","m5.PNG"};
		//자바는 필요한 부분(class)을 복사해서
		//조립해서 코딩하는 방식
		//부품(객체, 대상) 조립식 프로그램
		//객체지향형 프로그램(Object-Oriented Program, OOP)
		
		//Color.red : static(정적)
		//new Button : instance
		
		JFrame f = new JFrame();
		f.setTitle("나의 영화 정보 시스템");
		f.setSize(247, 400);
		//물 흐르듯이 하나씩 순서대로 붙여주는 클래스
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JButton img = new JButton();
		f.getContentPane().add(img);
		
		ImageIcon icon = new ImageIcon("m1.PNG");
		img.setIcon(icon);
		
		JButton b1 = new JButton("<<<생일>>>");
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("<<<헬보이>>>");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[1]);
				img.setIcon(icon);
			}
		});
		f.getContentPane().add(b2);
		ImageIcon icon2 = new ImageIcon("m2.PNG");
		JButton img3 = new JButton();
		img3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[2]);
				img.setIcon(icon);
			}
		});
		img3.setText("<<<돈(money)>>>");
		f.getContentPane().add(img3);
		
		JButton img4 = new JButton();
		img4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[3]);
				img.setIcon(icon);
			}
		});
		img4.setText("<<<파이브피트>>>");
		f.getContentPane().add(img4);
		
		JButton img5 = new JButton();
		img5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[4]);
				img.setIcon(icon);
			}
		});
		img5.setText("<<<어스>>>");
		f.getContentPane().add(img5);
		
//		URL url = new URL("http://www.naver.com");
//		File file = new File("C:/temp/test.txt");
//		PreparedStatement sql = new PreparedStatement("select * from memeber");
		
		f.setVisible(true);
		
		
	}
}
