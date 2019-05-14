package window;


import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫계산기 {
    private static JTextField n1;
    private static JTextField n2;

    public static void main(String[] args) {
        JFrame  f = new JFrame("나의 계산기");
        f.getContentPane().setBackground(new Color(0, 206, 209));
        f.setSize(514, 435);
        f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JLabel lblNewLabel_1 = new JLabel("<<< 나의 계산기 >>>");
        lblNewLabel_1.setForeground(Color.GREEN);
        lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 40));
        f.getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel = new JLabel("숫자1>>");
        lblNewLabel.setForeground(Color.BLUE);
        lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 36));
        f.getContentPane().add(lblNewLabel);
        
        n1 = new JTextField();
        n1.setBackground(Color.YELLOW);
        n1.setForeground(Color.RED);
        n1.setFont(new Font("Dialog", Font.PLAIN, 36));
        f.getContentPane().add(n1);
        n1.setColumns(10);
        
        JLabel label = new JLabel("숫자2>>");
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Dialog", Font.PLAIN, 36));
        f.getContentPane().add(label);
        
        n2 = new JTextField();
        n2.setForeground(Color.RED);
        n2.setFont(new Font("Dialog", Font.PLAIN, 36));
        n2.setColumns(10);
        n2.setBackground(Color.YELLOW);
        f.getContentPane().add(n2);
        
        JButton b = new JButton("두 수를 계산(덧셈)");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num1 = n1.getText();
                String num2 = n2.getText();
                
                int number1 = Integer.parseInt(num1);
                int number2 = Integer.parseInt(num2);
                
                System.out.println(number1 + number2);
            }
        });
        b.setBackground(new Color(255, 0, 255));
        b.setFont(new Font("굴림", Font.BOLD, 35));
        f.getContentPane().add(b);
        
        JButton button = new JButton("두 수를 계산(뺄셈)");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num1 = n1.getText();
                String num2 = n2.getText();
                
                int number1 = Integer.parseInt(num1);
                int number2 = Integer.parseInt(num2);
                
                System.out.println(number1 - number2);
            }
        });
        button.setFont(new Font("굴림", Font.BOLD, 35));
        button.setBackground(Color.MAGENTA);
        f.getContentPane().add(button);
        
        JButton button_1 = new JButton("두 수를 계산(곱셈)");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num1 = n1.getText();
                String num2 = n2.getText();
                
                int number1 = Integer.parseInt(num1);
                int number2 = Integer.parseInt(num2);
                
                System.out.println(number1 * number2);
            }
        });
        button_1.setFont(new Font("굴림", Font.BOLD, 35));
        button_1.setBackground(Color.MAGENTA);
        f.getContentPane().add(button_1);
        
        JButton button_2 = new JButton("두 수를 계산(나눗셈)");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num1 = n1.getText();
                String num2 = n2.getText();
                
                int number1 = Integer.parseInt(num1);
                int number2 = Integer.parseInt(num2);
                
                System.out.println(number1 / number2);
            }
        });
        button_2.setFont(new Font("굴림", Font.BOLD, 35));
        button_2.setBackground(Color.MAGENTA);
        f.getContentPane().add(button_2);
        f.setVisible(true);
    }

}