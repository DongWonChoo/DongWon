package MemberDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class SeatDAO {
	// 멤버변수

	String url = "jdbc:mysql://localhost:3306/pc";
	String user= "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	SeatDTO dto = null;
	
	
	public ArrayList seatViewer() {
		ArrayList list = new ArrayList();

		// 1. 드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 OK.");

			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 설정 OK..");

			// 3. SQL 결정(객체화)
			String sql = "select a.seat_num, b.id, b.count, a.vacant_seat from seat a left join member b on a.id = b.id";
			ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 객체화 OK...");

			// 4. SQL 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 OK....");

			// SQL문의 결과가 있으면, 받아서 처리
			while (rs.next()) {
				dto = new SeatDTO();
				int seat_num = rs.getInt(1);
				String id = rs.getString(2);
				Time count = rs.getTime(3);
				boolean vacant_seat = rs.getBoolean(4);
				dto.setSeat_num(seat_num);
				dto.setId(id);
				dto.setCount(count);
				dto.setVacant_seat(vacant_seat);
				list.add(dto);
			} //while close
		} catch (Exception e) {
			System.out.println("DB처리 중 에러발생...");
			System.out.println(e.getMessage());
		} finally {
			// 에러 발생 여부와 상관없이 무조건 실행해야 하는 코드!
			// 메모리를 많이 잡아 먹기 때
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				// e.printStackTrace();\
				System.out.println("자원 해제 중 에러 발생!!");
			} // catch
		} // try - catch - finally
		return list;
	}
	
	
	//멤버 메소드
	public void insert_seat(String seat_num, String id, String vacant_seat, String time) throws Exception {
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
	public void delete_seat(String seat_num) throws Exception {
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
	public void update_seat(String seat_num, String id, String vacant_seat, String time) throws Exception {
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
