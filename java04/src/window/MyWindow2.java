package window;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MyWindow2 {

    public static void main(String[] args) {
        //프레임
        JFrame f = new JFrame("입력값 받는 프로그램.");
        f.setSize(474, 294);
        
        //물흐르듯이 배치
        FlowLayout flow = new FlowLayout();
        
        JLabel label = new JLabel("당신의 주요 프로그램 언어를 입력하세요.");
        JTextField text = new JTextField(20);
        text.setBackground(Color.YELLOW);
        text.setForeground(Color.RED);
        
        JLabel label2 = new JLabel("당신이 사용하는 개발 툴을 입력하세요.");
        label2.setForeground(Color.BLUE);
        label2.setFont(new Font("굴림", Font.BOLD, 20));
        JTextField text2 = new JTextField(20);
        text2.setBackground(Color.YELLOW);
        text2.setForeground(Color.RED);
        text2.setFont(new Font("굴림", Font.BOLD, 20));
        
        text.setFont(new Font("굴림", Font.BOLD, 20));
        JButton button = new JButton("나를 눌러요.");
        button.setBackground(Color.BLUE);
        button.setForeground(Color.GREEN);
        button.setFont(new Font("굴림", Font.BOLD, 26));
        label.setFont(new Font("굴림", Font.BOLD, 20));
        label.setForeground(Color.BLUE);
        
        f.getContentPane().setLayout(flow);
        
        //버튼
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("버튼이 눌러졌군요..!!");
                String data = text.getText();
                System.out.println("당신의 주요 과목은 : " + data);
                
            }
        });
        
        //글자들
        //입력받는 화면(한줄짜리)
        
        f.getContentPane().add(label);
        f.getContentPane().add(text);
        f.getContentPane().add(label2);
        f.getContentPane().add(text2);
        f.getContentPane().add(button);
        
        JButton button2 = new JButton("나도 눌러요");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data2 = text2.getText();
                System.out.println("당신의 주요 툴은 : " + data2);
            }
        });
        button2.setBackground(Color.MAGENTA);
        button2.setForeground(Color.CYAN);
        button2.setFont(new Font("굴림", Font.BOLD, 26));
        f.getContentPane().add(button2);
        
        f.setVisible(true);
    }

}