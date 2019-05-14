package java17;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public MyPanel() {
		JButton b = new JButton("나는 패널에 있는 버튼"); 
		add(b);
	}
}
