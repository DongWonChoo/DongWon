package java15;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class BbsMain {
	private JTextField idText;
	private JTextField titleText;
	private JTextField contentText;
	private JTextField etcText;
	BbsDTO dto = new BbsDTO();
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public BbsMain() {
		JFrame f = new JFrame("³ªÀÇ °Ô½ÃÆÇ ¸¸µé±â");
		f.getContentPane().setFont(new Font("±¼¸²", Font.PLAIN, 20));
		f.setSize(306, 322);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel label = new JLabel("\uC544\uC774\uB514");
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		f.getContentPane().add(label);
		
		idText = new JTextField();
		idText.setFont(new Font("Dialog", Font.PLAIN, 20));
		f.getContentPane().add(idText);
		idText.setColumns(10);
		
		JLabel label_1 = new JLabel("\uC81C   \uBAA9");
		label_1.setFont(new Font("Dialog", Font.BOLD, 20));
		f.getContentPane().add(label_1);
		
		titleText = new JTextField();
		titleText.setFont(new Font("Dialog", Font.PLAIN, 20));
		titleText.setColumns(10);
		f.getContentPane().add(titleText);
		
		JLabel label_2 = new JLabel("\uB0B4   \uC6A9");
		label_2.setFont(new Font("Dialog", Font.BOLD, 20));
		f.getContentPane().add(label_2);
		
		contentText = new JTextField();
		contentText.setFont(new Font("Dialog", Font.PLAIN, 20));
		contentText.setColumns(10);
		f.getContentPane().add(contentText);
		
		JLabel label_3 = new JLabel("\uAE30   \uD0C0");
		label_3.setFont(new Font("Dialog", Font.BOLD, 20));
		f.getContentPane().add(label_3);
		
		etcText = new JTextField();
		etcText.setFont(new Font("Dialog", Font.PLAIN, 20));
		etcText.setColumns(10);
		f.getContentPane().add(etcText);
		
		JButton select_Button = new JButton("     BBS \uAC80\uC0C9\uD558\uAE30     ");
		select_Button.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		select_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputId = idText.getText();
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = dao.select(inputId);
				String id = dto.getId();
				String title = dto.getTitle();
				String content = dto.getContent();
				String etc = dto.getEtc();
				idText.setText(id);
				titleText.setText(title);
				contentText.setText(content);
				etcText.setText(etc);
			}
		});
		f.getContentPane().add(select_Button);
		
		JButton insert_Button = new JButton("     BBS \uC0BD\uC785\uD558\uAE30     ");
		insert_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsDTO dto = new BbsDTO();
				dto.setId(idText.getText());
				dto.setTitle(titleText.getText());
				dto.setContent(contentText.getText());
				dto.setEtc(etcText.getText());
				BbsDAO dao = new BbsDAO();
				try {
					dao.insert(dto);
					JOptionPane.showMessageDialog(null, "»ðÀÔ¿Ï·á");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		insert_Button.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		f.getContentPane().add(insert_Button);
		
		JButton delete_button = new JButton("     BBS \uC0AD\uC81C\uD558\uAE30     ");
		delete_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsDTO dto = new BbsDTO();
				dto.setId(idText.getText());
				BbsDAO dao = new BbsDAO();
				try {
					dao.delete(dto);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		delete_button.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		f.getContentPane().add(delete_button);
		
			
		f.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		BbsMain name = new BbsMain();
	}
}
