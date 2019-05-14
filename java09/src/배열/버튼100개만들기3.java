package 배열;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼100개만들기3 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 버튼들 ....200개");
		f.setSize(1200, 800);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton[] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("나는 버튼" + i);
		}
		
		buttons[0].setBounds(50, 50, 150, 100);
		f.add(buttons[0]);
		buttons[1].setBounds(200, 50, 150, 100);
		f.add(buttons[1]);
		buttons[2].setBounds(350, 50, 150, 100);
		f.add(buttons[2]);
		buttons[3].setBounds(600, 50, 150, 100);
		f.add(buttons[3]);
		buttons[4].setBounds(900, 50, 150, 100);
		f.add(buttons[4]);
		System.out.println(buttons[4].getText());
		
		
		f.setVisible(true);
	}

}
