package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class ����1 {
	public static void main(String[] args) throws Exception {
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� ok.");
		//2.DB����
		String url = "jdbc:mysql://localhost:3306/myphone";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ���� ok..");
		//3.SQL ����
		String id = JOptionPane.showInputDialog("ID �Է�");
		String title = JOptionPane.showInputDialog("title �Է�");
		String prc = JOptionPane.showInputDialog("price �Է�");
		String company = JOptionPane.showInputDialog("company �Է�");
		String sql = "insert into product values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		int price = Integer.parseInt(prc);
		ps.setString(1,id);
		ps.setString(2,title);
		ps.setInt(3, price);
		ps.setString(4,company);
		System.out.println("3. SQL ���� OK...");
		//4.SQL ����
		ps.executeUpdate();
		System.out.println("4. SQL ���� OK....");
	}
}
