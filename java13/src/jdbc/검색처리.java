package jdbc;

import javax.swing.JOptionPane;
import javax.swing.tree.ExpandVetoException;

public class 八祸贸府 {
	public static void main(String[] args) throws Exception {
		DB贸府 db = new DB贸府();
		String id = JOptionPane.showInputDialog("ID 涝仿 : ");
		String[] mem = db.select(id);
		for(String s : mem) {
			System.out.println(s);
		}
		//select * from member where id = ?
		
	}
}
