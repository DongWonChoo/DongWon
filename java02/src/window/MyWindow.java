package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.setTitle("나의 첫번째 그래픽 프로그램");
		
		JButton b1 = new JButton("나를 눌러주세요");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("눌렸다");
			}
		});
		f.getContentPane().add(b1, BorderLayout.CENTER);
		
		
		f.setVisible(true);
	}

}
