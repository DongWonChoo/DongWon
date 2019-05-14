package 배열;

import javax.swing.JButton;

public class 버튼100개만들기 {
	public static void main(String[] args) {
		JButton[] buttons = new JButton[100];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("나는 버튼");
		}
	}

}
