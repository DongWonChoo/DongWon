package java15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BbsDAO {
	//CRUD
	//������ �޼ҵ�� ������ �Ѵ�.
	//SQL�� select * from bbs where id = ?;
	
	String url = "jdbc:mysql://localhost:3306/bigdata";
	String user= "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	BbsDTO dto = null;
	
	public BbsDTO select(String inputId) {
		//1. ����̹� ����
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.����̹� ���� OK.");
			
			//2. DB����
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ���� OK..");
			
			//3. SQL ����(��üȭ)
			String sql = "select * from bbs where id =?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			System.out.println("3. SQL�� ��üȭ OK...");
			
			//4. SQL ����
			rs = ps.executeQuery();
			System.out.println("4. SQL�� ���� OK....");

			//SQL���� ����� ������, �޾Ƽ� ó��
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
				System.out.println("�˻� ����� �����ϴ�.");
			}
			
		} catch (Exception e) {
			System.out.println("DBó�� �� �����߻�...");
			System.out.println(e.getMessage());
		}finally {
			//���� �߻� ���ο� ������� ������ �����ؾ� �ϴ� �ڵ�!
			//�޸𸮸� ���� ��� �Ա� ��
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				//e.printStackTrace();\
				System.out.println("�ڿ� ���� �� ���� �߻�!!");
			} //catch
		} // try - catch - finally
		return dto;
	} // select �޼���
	
	public void insert(BbsDTO dto)  throws Exception {
		
//		1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� OK..");
		
//		2. DB����(DB��, ID, PW)
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ���� OK...");
		
//		3. SQL ����
//		id = JOptionPane.showInputDialog("ID�Է�");
//		pw = JOptionPane.showInputDialog("pw�Է�");
//		name = JOptionPane.showInputDialog("name�Է�");
//		tel = JOptionPane.showInputDialog("tel�Է�");
		//String sql = "insert into member values ('" + id + "','" + pw + "','" + name + "','" + tel + "')";
		//���� ���
		String sql = "insert into bbs values (?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getEtc());
		System.out.println("3. SQL�� ���� OK...");

//		4. SLQ ����
		ps.executeUpdate();
		System.out.println("4. SQL ���� OK...");
	}
	
	public void delete(BbsDTO dto)  throws Exception {
		
//		1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� OK..");
		
//		2. DB����(DB��, ID, PW)
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ���� OK...");
		
//		3. SQL ����
//		id = JOptionPane.showInputDialog("ID�Է�");
//		pw = JOptionPane.showInputDialog("pw�Է�");
//		name = JOptionPane.showInputDialog("name�Է�");
//		tel = JOptionPane.showInputDialog("tel�Է�");
		//String sql = "insert into member values ('" + id + "','" + pw + "','" + name + "','" + tel + "')";
		//���� ���
		String sql = "delete from bbs where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		System.out.println("3. SQL�� ���� OK...");

//		4. SLQ ����
		ps.executeUpdate();
		System.out.println("4. SQL ���� OK...");
	}
	
}// class
