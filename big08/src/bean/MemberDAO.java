package bean;

import java.sql.*;

public class MemberDAO {
		public void insert(MemberDTO dto) throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bigdata";
			String user = "root";
			String password = "1234";
			String sql = "insert into member values (?,?,?,?)";
			
			Connection conn = null;
			PreparedStatement ps = null; /* insert 할때 변수 */
			
			conn = DriverManager.getConnection(url,user,password);
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getTel());
			ps.executeUpdate();				
		}

}
