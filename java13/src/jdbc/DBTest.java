package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DBTest {
	public static void main(String[] args)  throws Exception {
		
//		1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK..");
		
//		2. DB연결(DB명, ID, PW)
		String url ="jdbc:mysql://localhost:3306/bigdata";
		String user ="root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 설정 OK...");
		
//		3. SQL 결정
		String id = JOptionPane.showInputDialog("ID입력");
		String pw = JOptionPane.showInputDialog("pw입력");
		String name = JOptionPane.showInputDialog("name입력");
		String tel = JOptionPane.showInputDialog("tel입력");
		//String sql = "insert into member values ('" + id + "','" + pw + "','" + name + "','" + tel + "')";
		//쉬운 방법
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,id);
		ps.setString(2,pw);
		ps.setString(3,name);
		ps.setString(4,tel);
		System.out.println("3. SQL문 결정 OK...");
		//객체화
//		String url = "http://www.naver.com";
//		URL url2 = new URL(url);
		
//		4. SLQ 전송
		ps.executeUpdate();
		System.out.println("4. SQL 전송 OK...");
	}
}
