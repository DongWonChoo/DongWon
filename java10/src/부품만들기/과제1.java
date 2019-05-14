package 부품만들기;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 과제1 {
   public static void main(String[] args) {
      String[] food = { "food1.jpg", "food2.jpg", "food3.jpg" };
      Test c = new Test();
      int sum=0;
      c.count = 0;
      int jajjang  = c.price();
      int jjambong = c.price();
      int noodle = c.price();
      JFrame f = new JFrame();
      JButton img = new JButton();
      JButton b1 = new JButton("자장");
      JTextField t1 = new JTextField(5);
      JTextField t2 = new JTextField(10);
      b1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ImageIcon icon = new ImageIcon(food[0]);
            img.setIcon(icon);
            t1.setText(String.valueOf(++c.count));
            t2.setText(String.valueOf(jajjang*c.count));
         }
      });
      JButton b2 = new JButton("우장");
      b2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ImageIcon icon = new ImageIcon(food[1]);
            img.setIcon(icon);
            t1.setText(String.valueOf(++c.count));
            t2.setText(String.valueOf(jjambong*c.count));
         }
      });
      JButton b3 = new JButton("짬장");
      b3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ImageIcon icon = new ImageIcon(food[2]);
            img.setIcon(icon);
            t1.setText(String.valueOf(++c.count));
            t2.setText(String.valueOf(noodle*c.count));
         }
      });

      
      JLabel l1 = new JLabel("개수");
      JLabel l2 = new JLabel("금액");
      FlowLayout flow = new FlowLayout();
      ImageIcon icon = new ImageIcon("food0.jpg");

      f.setSize(550, 600);
      f.getContentPane().add(b1);
      f.getContentPane().add(b2);
      f.getContentPane().add(b3);
      f.getContentPane().add(l1);
      f.getContentPane().add(t1);
      f.getContentPane().add(l2);
      f.getContentPane().add(t2);
      f.getContentPane().add(img);
      img.setIcon(icon);
      img.setIcon(icon);
      f.getContentPane().setLayout(flow);
      f.setVisible(true);
   }
}