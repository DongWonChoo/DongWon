package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyWindow2 {

	public static void main(String[] args) {
		JFrame fram =new JFrame();
		fram.setSize(300, 300);
		fram.setTitle("자바 프로젝트 시작");
		
		JButton b1 = new JButton("자바 프로젝트");
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JButton b2 = new JButton("두번째 버튼");
				fram.getContentPane().add(b2);
			}
		});
		
		fram.getContentPane().add(b1);
		
		fram.setVisible(true);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
