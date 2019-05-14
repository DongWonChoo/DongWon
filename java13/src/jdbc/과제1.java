package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class 과제1 {
	public static void main(String[] args) throws Exception {
		//1.드라이버 실행
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 ok.");
		//2.DB연결
		String url = "jdbc:mysql://localhost:3306/myphone";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 설정 ok..");
		//3.SQL 설정
		String id = JOptionPane.showInputDialog("ID 입력");
		String title = JOptionPane.showInputDialog("title 입력");
		String prc = JOptionPane.showInputDialog("price 입력");
		String company = JOptionPane.showInputDialog("company 입력");
		String sql = "insert into product values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		int price = Integer.parseInt(prc);
		ps.setString(1,id);
		ps.setString(2,title);
		ps.setInt(3, price);
		ps.setString(4,company);
		System.out.println("3. SQL 결정 OK...");
		//4.SQL 전송
		ps.executeUpdate();
		System.out.println("4. SQL 전송 OK....");
	}
}
