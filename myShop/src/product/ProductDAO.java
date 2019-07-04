package product;

import java.sql.*;
import java.util.ArrayList;

import product.DBConnectionMgr;

public class ProductDAO {
	DBConnectionMgr mgr;
	public ProductDAO() {
		mgr = DBConnectionMgr.getInstance();
	}
	
	public ArrayList<ProductDTO> selectAll() throws Exception {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		
		Connection con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "select * from product";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//4단계 sql 전달 요청
		ResultSet rs = ps.executeQuery();
		ProductDTO in_dto = null;
		
		while(rs.next()) {
			in_dto = new ProductDTO();
			String pro_id = rs.getString(1);
			String pro_name =rs.getString(2);
			String pro_content =rs.getString(3);
			Integer pro_price = rs.getInt(4);
			in_dto.setPro_id(pro_id);
			in_dto.setPro_name(pro_name);
			in_dto.setPro_content(pro_content);
			in_dto.setPro_price(pro_price);
			list.add(in_dto);
		}
		return list;
	}
	
	public ProductDTO select(ProductDTO dto) throws Exception {
		Connection con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "select * from product where pro_id=? or pro_name=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getPro_id());
		ps.setString(2, dto.getPro_name());
		
		//4단계 sql 전달 요청
		ResultSet rs = ps.executeQuery();
		ProductDTO in_dto = null;
		if(rs.next()) {
			in_dto = new ProductDTO();
			String pro_id = rs.getString(1);
			String pro_name =rs.getString(2);
			String pro_content =rs.getString(3);
			Integer pro_price = rs.getInt(4);
			in_dto.setPro_id(pro_id);
			in_dto.setPro_name(pro_name);
			in_dto.setPro_content(pro_content);
			in_dto.setPro_price(pro_price);
		}
		return in_dto;
	}
	
	public void insert(ProductDTO dto) throws Exception {
		Connection con = mgr.getConnection();
		
		String sql = "insert into product values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getPro_id());
		ps.setString(2, dto.getPro_name());
		ps.setString(3, dto.getPro_content());
		ps.setInt(4, dto.getPro_price());
		
		ps.executeUpdate();
		mgr.freeConnection(con, ps);
	}
	
	public void update(ProductDTO dto) throws Exception {
		Connection con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "update product set pro_name=?, pro_content=?, pro_price=? where pro_id=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getPro_name());
		ps.setString(2, dto.getPro_content());
		ps.setInt(3, dto.getPro_price());
		ps.setString(4, dto.getPro_id());
		
		//4단계 sql 전달 요청
		ps.executeUpdate();
		mgr.freeConnection(con, ps);
	}
	
	public void delete(ProductDTO dto) throws Exception {
		Connection con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "delete from product where pro_id=? or pro_name=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getPro_id());
		ps.setString(2, dto.getPro_name());
		
		//4단계 sql 전달 요청
		ps.executeUpdate();
		mgr.freeConnection(con, ps);
	}
}
