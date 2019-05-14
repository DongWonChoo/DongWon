package window;


import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의두번째계산기 {
    private static JTextField n1;
    private static JTextField n2;
    private static JTextField oper;

    public static void main(String[] args) {
        JFrame  f = new JFrame("나의 두번째 계산기");
        f.setSize(500, 400);
        FlowLayout flow = new FlowLayout();
        f.getContentPane().setLayout(flow);
        
        JLabel lblNewLabel = new JLabel("숫자1");
        lblNewLabel.setFont(new Font("굴림", Font.BOLD, 36));
        f.getContentPane().add(lblNewLabel);
        
        n1 = new JTextField();
        n1.setForeground(Color.BLUE);
        n1.setBackground(Color.YELLOW);
        n1.setFont(new Font("굴림", Font.BOLD, 36));
        f.getContentPane().add(n1);
        n1.setColumns(10);
        
        JLabel label = new JLabel("숫자2");
        label.setFont(new Font("굴림", Font.BOLD, 36));
        f.getContentPane().add(label);
        
        n2 = new JTextField();
        n2.setForeground(Color.BLUE);
        n2.setFont(new Font("굴림", Font.BOLD, 36));
        n2.setColumns(10);
        n2.setBackground(Color.YELLOW);
        f.getContentPane().add(n2);
        
        JLabel label_1 = new JLabel("연산자");
        label_1.setFont(new Font("굴림", Font.BOLD, 36));
        f.getContentPane().add(label_1);
        
        oper = new JTextField();
        oper.setForeground(Color.RED);
        oper.setFont(new Font("굴림", Font.BOLD, 36));
        oper.setColumns(10);
        oper.setBackground(Color.GREEN);
        f.getContentPane().add(oper);
        
        JButton b = new JButton("해당 연산자 계산");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nn1 = n1.getText();
                String nn2 = n2.getText();
                int num1 = Integer.parseInt(nn1);
                int num2 = Integer.parseInt(nn2);
                String data = oper.getText();
                
                int imsi = 0;
                if(data.equals("+")) {
                    imsi = num1 + num2;
                }else if(data.equals("-")) {
                    imsi = num1 - num2;
                }else if(data.equals("*")) {
                    imsi = num1 * num2;
                }else if(data.equals("/")) {
                    imsi = num1 / num2;
                }else {
                    System.out.println("연산할 수 없는 기호입니다.");
                }
                
                System.out.println("두 수의 연산 결과는 " + imsi + "입니다.");
                
                       
                
                
                
                
            }
        });
        b.setForeground(Color.RED);
        b.setBackground(SystemColor.activeCaption);
        b.setFont(new Font("굴림", Font.PLAIN, 49));
        f.getContentPane().add(b);
        
        
        
        
        f.setVisible(true);
    }

}