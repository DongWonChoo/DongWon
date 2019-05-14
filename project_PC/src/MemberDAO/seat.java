package MemberDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class seat {
	// 멤버변수
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	int a =0;
	
	//멤버 메소드
	public void seat_delete(String seat_num) throws Exception {
//		1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK.");
		
//		2. DB연결(DB명, ID, NAME, PW, BIRTH, TEL, COUNT)
		url = "jdbc:mysql://localhost:3306/pc";
		user ="root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 설정 OK..");
		
//		3. SQL 결정
		String sql = "delete from member where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1,seat_num);
		System.out.println("3. SQL문 결정 OK...");
		
//4. SQL 전송
		ps.executeUpdate();
		System.out.println("4. SQL 전송 OK....");
	}
	
	
	//멤버 메소드
		public void seat_insert(String seat_num, String id, String vacant_seat, String time) throws Exception {
//			1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 OK.");
//			2. DB연결(DB명, ID, NAME, PW, BIRTH, TEL, COUNT)
			url = "jdbc:mysql://localhost:3306/pc";
			user ="root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 설정 OK..");
//			3. SQL 결정
			String sql = "insert into member values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			
			//String to date
			String count = time;
			SimpleDateFormat transFormat = new SimpleDateFormat("HH:mm:ss");
			Date to = transFormat.parse(count);
			
			ps.setString(1,seat_num);
			ps.setString(2,id);
			ps.setString(3,vacant_seat);
			ps.setString(4,count);
			System.out.println("3. SQL문 결정 OK...");
	//4. SQL 전송
			ps.executeUpdate();
			System.out.println("4. SQL 전송 OK....");
		}
		
		//멤버 메소드
		public void seat_update(String seat_num, String id, String vacant_seat, String time) throws Exception {
//			1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 OK.");
//			2. DB연결(DB명, ID, NAME, PW, BIRTH, TEL, COUNT)
			url = "jdbc:mysql://localhost:3306/pc";
			user ="root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 설정 OK..");
//			3. SQL 결정
			String sql = "Update member set seat=?, vacant_seat=?, count=? where id=?";
			ps = con.prepareStatement(sql);
			
			//String to date
			String count = time;
			SimpleDateFormat transFormat = new SimpleDateFormat("HH:mm:ss");
			Date to = transFormat.parse(count);
			
			//String to boolean(tinyint->int값)

			
			ps.setString(1,seat_num);
			//ps.setString(2,result);
			ps.setString(3,count);
			ps.setString(4,id);
			System.out.println("3. SQL문 결정 OK...");
	//4. SQL 전송
			ps.executeUpdate();
			System.out.println("4. SQL 전송 OK....");
		}
}
