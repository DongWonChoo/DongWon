package java18;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CarUser {
	private JTextField idText;
	private JTextField nameText;
	private JTextField contentText;
	private JTextField priceText;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public CarUser() {
		CarDTO dto = new CarDTO();
		JFrame f = new JFrame();		
		f.setSize(254, 501);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel label = new JLabel("          \uC544\uC774\uB514          ");
		label.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		f.getContentPane().add(label);
		
		idText = new JTextField();
		idText.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		f.getContentPane().add(idText);
		idText.setColumns(10);
		
		JLabel label_1 = new JLabel("          \uC774   \uB984          ");
		label_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		f.getContentPane().add(label_1);
		
		nameText = new JTextField();
		nameText.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		nameText.setColumns(10);
		f.getContentPane().add(nameText);
		
		JLabel lblContent = new JLabel("          Content          ");
		lblContent.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		f.getContentPane().add(lblContent);
		
		contentText = new JTextField();
		contentText.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		contentText.setColumns(10);
		f.getContentPane().add(contentText);
		
		JLabel label_3 = new JLabel("          \uAC00   \uACA9          ");
		label_3.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		f.getContentPane().add(label_3);
		
		priceText = new JTextField();
		priceText.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		priceText.setColumns(10);
		f.getContentPane().add(priceText);
		
		JButton select_Button = new JButton("\uAC80\uC0C9\uD558\uAE30");
		select_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputId = idText.getText();
				CarDAO dao = new CarDAO();
				CarDTO dto = dao.select(inputId);
				String id = dto.getId();
				String name = dto.getName();
				String content = dto.getContent();
				double price = dto.getPrice();
				idText.setText(id);
				nameText.setText(name);
				contentText.setText(content);
				priceText.setText(Double.toString(price));
			}
		});
		select_Button.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		f.getContentPane().add(select_Button);
		
		JButton insert_Button = new JButton("\uC785\uB825\uD558\uAE30");
		insert_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarDTO dto = new CarDTO();
				dto.setId(idText.getText());
				dto.setName(nameText.getText());
				dto.setContent(contentText.getText());
				dto.setPrice(Double.parseDouble(priceText.getText()));
				CarDAO dao = new CarDAO();
				try {
					dao.insert(dto);
					JOptionPane.showMessageDialog(null, "»ðÀÔ¿Ï·á");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		insert_Button.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		f.getContentPane().add(insert_Button);
		
		JButton update_Button = new JButton("\uC218\uC815\uD558\uAE30");
		update_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputId = idText.getText();
				Double inputPrice = Double.parseDouble(priceText.getText());
				CarDAO dao = new CarDAO(); 
				CarDTO dto = new CarDTO();
				try {
					dao.update(inputId,inputPrice);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		update_Button.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		f.getContentPane().add(update_Button);
		
		JButton delete_Button = new JButton("\uC0AD\uC81C\uD558\uAE30");
		delete_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarDTO dto = new CarDTO();
				dto.setId(idText.getText());
				CarDAO dao = new CarDAO();
				try {
					dao.delete(dto);
					JOptionPane.showMessageDialog(null, "»èÁ¦¿Ï·á");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		delete_Button.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		f.getContentPane().add(delete_Button);
		
		f.setVisible(true);
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		CarUser cu = new CarUser();
	}
}
