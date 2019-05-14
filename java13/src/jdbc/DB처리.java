package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBó�� {
	//�������
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;
	
	// delete ����޼ҵ�
	public void delete(String id)  throws Exception {
		
//		1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� OK..");
		
//		2. DB����(DB��, ID, PW)
		url ="jdbc:mysql://localhost:3306/bigdata";
		user ="root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ���� OK...");
		
//		3. SQL ����
//		id = JOptionPane.showInputDialog("ID�Է�");
//		pw = JOptionPane.showInputDialog("pw�Է�");
//		name = JOptionPane.showInputDialog("name�Է�");
//		tel = JOptionPane.showInputDialog("tel�Է�");
		//String sql = "insert into member values ('" + id + "','" + pw + "','" + name + "','" + tel + "')";
		//���� ���
		String sql = "delete from member where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1,id);
		System.out.println("3. SQL�� ���� OK...");

//		4. SLQ ����
		ps.executeUpdate();
		System.out.println("4. SQL ���� OK...");
	}
	
	// insert ����޼ҵ�
		public void insert(MemberDTO dto)  throws Exception {
			
//			1.����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� OK..");
			
//			2. DB����(DB��, ID, PW)
			url ="jdbc:mysql://localhost:3306/bigdata";
			user ="root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ���� OK...");
			
//			3. SQL ����
//			id = JOptionPane.showInputDialog("ID�Է�");
//			pw = JOptionPane.showInputDialog("pw�Է�");
//			name = JOptionPane.showInputDialog("name�Է�");
//			tel = JOptionPane.showInputDialog("tel�Է�");
			//String sql = "insert into member values ('" + id + "','" + pw + "','" + name + "','" + tel + "')";
			//���� ���
			String sql = "insert into member values (?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1,dto.getId());
			ps.setString(2,dto.getPw());
			ps.setString(3,dto.getName());
			ps.setString(4,dto.getTel());
			System.out.println("3. SQL�� ���� OK...");

//			4. SLQ ����
			ps.executeUpdate();
			System.out.println("4. SQL ���� OK...");
		}
		
		// select ����޼ҵ�
		public String[] select(String id)  throws Exception {
			
//			1.����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� OK..");
			
//			2. DB����(DB��, ID, PW)
			url ="jdbc:mysql://localhost:3306/bigdata";
			user ="root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ���� OK...");
			
//			3. SQL�� ����
			String sql = "select * from member where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1,id);
			System.out.println("3. SQL�� ���� OK...");

//			4. SLQ ����
			rs = ps.executeQuery();
			System.out.println("4. SQL ���� OK...");
			String[] mem = new String[4];
			if(rs.next()) { //���ڵ� ����o
				mem = new String[4];
				String s1 = rs.getString(1);
				String s2 = rs.getString(2);
				String s3 = rs.getString(3);
				String s4 = rs.getString(4);
				
				mem[0] = s1;
				mem[1] = s2;
				mem[2] = s3;
				mem[3] = s4;
				//�������� ����߸��� �ڵ�
//				System.out.println("�˻��� ID : " + s1);
//				System.out.println("�˻��� pw : " + s2);
//				System.out.println("�˻��� name : " + s3);
//				System.out.println("�˻��� tel : " + s4);
			} else { //���ڵ� ����x
				System.out.println("�˻� ����� �����ϴ�.");
			}
			return mem;
		}
		
		// update ����޼ҵ�
		public void update(String id, String tel) throws Exception {

//			1.����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� OK..");

//			2. DB����(DB��, ID, PW)
			url = "jdbc:mysql://localhost:3306/bigdata";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ���� OK...");

//			3. SQL ����
//			id = JOptionPane.showInputDialog("ID�Է�");
//			pw = JOptionPane.showInputDialog("pw�Է�");
//			name = JOptionPane.showInputDialog("name�Է�");
//			tel = JOptionPane.showInputDialog("tel�Է�");
			// String sql = "insert into member values ('" + id + "','" + pw + "','" + name + "','" + tel + "')";
			// ���� ���
			String sql = "Update member set tel=? where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, id);
			System.out.println("3. SQL�� ���� OK...");

//			4. SLQ ����
			ps.executeUpdate();
			System.out.println("4. SQL ���� OK...");
		}
	
}
