package MemberDAO;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class PcMain {
	SeatDTO dto = new SeatDTO();

	/**
	 * @wbp.parser.entryPoint
	 */
	public PcMain() {
		JFrame f = new JFrame("PC ´Ü¸»±â");
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		Button button = new Button(Integer.toString(dto.getSeat_num()) +"\n\n" + dto.getSeat_num());
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(button);

		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		f.getContentPane().add(tglbtnNewToggleButton);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btnNewButton);
		f.setSize(1040, 700);

		f.setVisible(true);
	}	

	public static void main(String[] args) {
		PcMain pc = new PcMain();
//		SeatDAO dao = new SeatDAO();
//		ArrayList list = dao.seatViewer();
//
//		for (int i = 0; i < list.size(); i++) {
//			SeatDTO dto = (SeatDTO) list.get(i);
//			System.out.println(dto.getSeat_num());
//			System.out.println(dto.getId());
//			System.out.println(dto.getCount());
//			System.out.println(dto.isVacant_seat());
//			System.out.println();
//		}
	}
}
