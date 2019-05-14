package java15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BbsDAO {
	//CRUD
	//각각을 메소드로 만들어야 한다.
	//SQL문 select * from bbs where id = ?;
	
	String url = "jdbc:mysql://localhost:3306/bigdata";
	String user= "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	BbsDTO dto = null;
	
	public BbsDTO select(String inputId) {
		//1. 드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 OK.");
			
			//2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 설정 OK..");
			
			//3. SQL 결정(객체화)
			String sql = "select * from bbs where id =?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			System.out.println("3. SQL문 객체화 OK...");
			
			//4. SQL 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 OK....");

			//SQL문의 결과가 있으면, 받아서 처리
			if(rs.next()) {
				dto = new BbsDTO();
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
				
			} else {
				System.out.println("검색 결과가 없습니다.");
			}
			
		} catch (Exception e) {
			System.out.println("DB처리 중 에러발생...");
			System.out.println(e.getMessage());
		}finally {
			//에러 발생 여부와 상관없이 무조건 실행해야 하는 코드!
			//메모리를 많이 잡아 먹기 때
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				//e.printStackTrace();\
				System.out.println("자원 해제 중 에러 발생!!");
			} //catch
		} // try - catch - finally
		return dto;
	} // select 메서드
	
	public void insert(BbsDTO dto)  throws Exception {
		
//		1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK..");
		
//		2. DB연결(DB명, ID, PW)
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 설정 OK...");
		
//		3. SQL 결정
//		id = JOptionPane.showInputDialog("ID입력");
//		pw = JOptionPane.showInputDialog("pw입력");
//		name = JOptionPane.showInputDialog("name입력");
//		tel = JOptionPane.showInputDialog("tel입력");
		//String sql = "insert into member values ('" + id + "','" + pw + "','" + name + "','" + tel + "')";
		//쉬운 방법
		String sql = "insert into bbs values (?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getEtc());
		System.out.println("3. SQL문 결정 OK...");

//		4. SLQ 전송
		ps.executeUpdate();
		System.out.println("4. SQL 전송 OK...");
	}
	
	public void delete(BbsDTO dto)  throws Exception {
		
//		1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK..");
		
//		2. DB연결(DB명, ID, PW)
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 설정 OK...");
		
//		3. SQL 결정
//		id = JOptionPane.showInputDialog("ID입력");
//		pw = JOptionPane.showInputDialog("pw입력");
//		name = JOptionPane.showInputDialog("name입력");
//		tel = JOptionPane.showInputDialog("tel입력");
		//String sql = "insert into member values ('" + id + "','" + pw + "','" + name + "','" + tel + "')";
		//쉬운 방법
		String sql = "delete from bbs where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		System.out.println("3. SQL문 결정 OK...");

//		4. SLQ 전송
		ps.executeUpdate();
		System.out.println("4. SQL 전송 OK...");
	}
	
}// class
