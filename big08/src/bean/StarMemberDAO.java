package bean;

import java.sql.*;

public class StarMemberDAO {
		public void insert(StarMemberDTO dto) throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/star";
			String user = "root";
			String password = "1234";
			String sql = "insert into member values (?,?,?,?,?,?,?,?,?)";
			
			Connection conn = null;	
			PreparedStatement ps = null; /* insert 할때 변수 */
			
			conn = DriverManager.getConnection(url,user,password);
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getTel());
			ps.setString(4, dto.getAddr());
			ps.setString(5, dto.getTall());
			ps.setString(6, dto.getKg());
			ps.setString(7, dto.getSex());
			ps.setString(8, dto.getAge());
			ps.setString(9, dto.getEmail());
			ps.executeUpdate();				
		}

}
