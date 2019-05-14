package java18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarDAO {
	//CRUD
		//������ �޼ҵ�� ������ �Ѵ�.
		//SQL�� select * from bbs where id = ?;
		
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user= "root";
		String password = "1234";
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		CarDTO dto = null;
		
		public CarDTO select(String inputId) {
			//1. ����̹� ����
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1.����̹� ���� OK.");
				
				//2. DB����
				con = DriverManager.getConnection(url, user, password);
				System.out.println("2. DB���� ���� OK..");
				
				//3. SQL ����(��üȭ)
				String sql = "select * from carSale where id =?";
				ps = con.prepareStatement(sql);
				ps.setString(1, inputId);
				System.out.println("3. SQL�� ��üȭ OK...");
				
				//4. SQL ����
				rs = ps.executeQuery();
				System.out.println("4. SQL�� ���� OK....");

				//SQL���� ����� ������, �޾Ƽ� ó��
				if(rs.next()) {
					dto = new CarDTO();
					String id = rs.getString(1);
					String name = rs.getString(2);
					String content = rs.getString(3);
					double price = rs.getDouble(4);
					dto.setId(id);
					dto.setName(name);
					dto.setContent(content);
					dto.setPrice(price);
					
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
		
		public void insert(CarDTO dto)  throws Exception {
//				1.����̹� ����
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1. ����̹� ���� OK..");
				
//				2. DB����(DB��, ID, PW)
				con = DriverManager.getConnection(url, user, password);
				System.out.println("2. DB���� ���� OK...");
				
//				3. SQL ����
				String sql = "insert into carSale values (?,?,?,?)";
				ps = con.prepareStatement(sql);
				ps.setString(1, dto.getId());
				ps.setString(2, dto.getName());
				ps.setString(3, dto.getContent());
				ps.setDouble(4, dto.getPrice());
				System.out.println("3. SQL�� ���� OK...");

//				4. SLQ ����
				ps.executeUpdate();
				System.out.println("4. SQL ���� OK...");
		}
		
		public void delete(CarDTO dto)  throws Exception {
//				1.����̹� ����
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1. ����̹� ���� OK..");
				
//				2. DB����(DB��, ID, PW)
				con = DriverManager.getConnection(url, user, password);
				System.out.println("2. DB���� ���� OK...");
				
//				3. SQL ����
				String sql = "delete from carSale where id = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, dto.getId());
				System.out.println("3. SQL�� ���� OK...");

//				4. SLQ ����
				ps.executeUpdate();
				System.out.println("4. SQL ���� OK...");
//			
		}
		// update ����޼ҵ� 
		public void update(String inputId, Double inputPrice) throws Exception {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1.����̹� ���� OK.");
				
				//2. DB����
				con = DriverManager.getConnection(url, user, password);
				System.out.println("2. DB���� ���� OK..");
				
				//3. SQL ����(��üȭ)
				String sql = "Update carSale set price=? where id=?";
				ps = con.prepareStatement(sql);
				ps.setDouble(1, inputPrice);
				ps.setString(2, inputId);
				System.out.println("3. SQL�� ��üȭ OK...");
				
				//4. SQL ����
				ps.executeUpdate();
				System.out.println("4. SQL�� ���� OK....");
				
			} catch (Exception e) {
				System.out.println("DBó�� �� �����߻�...");
				System.out.println(e.getMessage());
			}finally {
				//���� �߻� ���ο� ������� ������ �����ؾ� �ϴ� �ڵ�!
				//�޸𸮸� ���� ��� �Ա� ��
				try {
					ps.close();
					con.close();
				} catch (SQLException e) {
					//e.printStackTrace();\
					System.out.println("�ڿ� ���� �� ���� �߻�!!");
				} //catch
			} // try - catch - finally
//			return dto;
		} // select �޼���
}
