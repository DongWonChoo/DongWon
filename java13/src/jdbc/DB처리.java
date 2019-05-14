package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB처리 {
	//멤버변수
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;
	
	// delete 멤버메소드
	public void delete(String id)  throws Exception {
		
//		1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK..");
		
//		2. DB연결(DB명, ID, PW)
		url ="jdbc:mysql://localhost:3306/bigdata";
		user ="root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 설정 OK...");
		
//		3. SQL 결정
//		id = JOptionPane.showInputDialog("ID입력");
//		pw = JOptionPane.showInputDialog("pw입력");
//		name = JOptionPane.showInputDialog("name입력");
//		tel = JOptionPane.showInputDialog("tel입력");
		//String sql = "insert into member values ('" + id + "','" + pw + "','" + name + "','" + tel + "')";
		//쉬운 방법
		String sql = "delete from member where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1,id);
		System.out.println("3. SQL문 결정 OK...");

//		4. SLQ 전송
		ps.executeUpdate();
		System.out.println("4. SQL 전송 OK...");
	}
	
	// insert 멤버메소드
		public void insert(MemberDTO dto)  throws Exception {
			
//			1.드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 OK..");
			
//			2. DB연결(DB명, ID, PW)
			url ="jdbc:mysql://localhost:3306/bigdata";
			user ="root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 설정 OK...");
			
//			3. SQL 결정
//			id = JOptionPane.showInputDialog("ID입력");
//			pw = JOptionPane.showInputDialog("pw입력");
//			name = JOptionPane.showInputDialog("name입력");
//			tel = JOptionPane.showInputDialog("tel입력");
			//String sql = "insert into member values ('" + id + "','" + pw + "','" + name + "','" + tel + "')";
			//쉬운 방법
			String sql = "insert into member values (?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1,dto.getId());
			ps.setString(2,dto.getPw());
			ps.setString(3,dto.getName());
			ps.setString(4,dto.getTel());
			System.out.println("3. SQL문 결정 OK...");

//			4. SLQ 전송
			ps.executeUpdate();
			System.out.println("4. SQL 전송 OK...");
		}
		
		// select 멤버메소드
		public String[] select(String id)  throws Exception {
			
//			1.드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 OK..");
			
//			2. DB연결(DB명, ID, PW)
			url ="jdbc:mysql://localhost:3306/bigdata";
			user ="root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 설정 OK...");
			
//			3. SQL문 결정
			String sql = "select * from member where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1,id);
			System.out.println("3. SQL문 결정 OK...");

//			4. SLQ 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL 전송 OK...");
			String[] mem = new String[4];
			if(rs.next()) { //레코드 존재o
				mem = new String[4];
				String s1 = rs.getString(1);
				String s2 = rs.getString(2);
				String s3 = rs.getString(3);
				String s4 = rs.getString(4);
				
				mem[0] = s1;
				mem[1] = s2;
				mem[2] = s3;
				mem[3] = s4;
				//응집도를 떨어뜨리는 코드
//				System.out.println("검색된 ID : " + s1);
//				System.out.println("검색된 pw : " + s2);
//				System.out.println("검색된 name : " + s3);
//				System.out.println("검색된 tel : " + s4);
			} else { //레코드 존재x
				System.out.println("검색 결과가 없습니다.");
			}
			return mem;
		}
		
		// update 멤버메소드
		public void update(String id, String tel) throws Exception {

//			1.드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 OK..");

//			2. DB연결(DB명, ID, PW)
			url = "jdbc:mysql://localhost:3306/bigdata";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 설정 OK...");

//			3. SQL 결정
//			id = JOptionPane.showInputDialog("ID입력");
//			pw = JOptionPane.showInputDialog("pw입력");
//			name = JOptionPane.showInputDialog("name입력");
//			tel = JOptionPane.showInputDialog("tel입력");
			// String sql = "insert into member values ('" + id + "','" + pw + "','" + name + "','" + tel + "')";
			// 쉬운 방법
			String sql = "Update member set tel=? where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, id);
			System.out.println("3. SQL문 결정 OK...");

//			4. SLQ 전송
			ps.executeUpdate();
			System.out.println("4. SQL 전송 OK...");
		}
	
}
