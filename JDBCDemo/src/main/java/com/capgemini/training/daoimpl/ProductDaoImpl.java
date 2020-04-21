package com.capgemini.training.daoimpl;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.training.daos.ProductDao;
import com.capgemini.training.model.Product;
import com.capgemini.training.util.DBUtil;

public class ProductDaoImpl implements ProductDao {
	
	Connection con = null;
	public ProductDaoImpl() {
		con = DBUtil.createConnection();
	}

	@Override
	public List<Product> retriveProducts() {
		
		List<Product> products = new ArrayList<Product>();
		try {
			String sql = "select * from product";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setQty(rs.getInt(3));
				p.setPrice(rs.getDouble(4));
				p.setBrand(rs.getString(5));
				products.add(p);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public Product retriveProductById(int pid) {

		Product pro = new Product();
		try {
			String sql = "Select * from product where pid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, pid);
			ResultSet rs = ps.executeQuery(sql);
			pro.setPid(rs.getInt(1));
			pro.setPname(rs.getString(2));
			pro.setQty(rs.getInt(3));
			pro.setPrice(rs.getDouble(4));
			pro.setBrand(rs.getString(5));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pro;
	}

	@Override
	public List<Product> retriveProductByBrand(String brand) {
		
		List<Product> products = new ArrayList<Product>();
		try {
			String sql = "Select * from product where brand = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, brand);
			ResultSet rs = ps.executeQuery(sql);
			
			while(rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setQty(rs.getInt(3));
				p.setPrice(rs.getDouble(4));
				p.setBrand(rs.getString(5));
				products.add(p);
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public void insertProduct(Product p) {
		String sql = "insert into product values(?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, p.getPid());
			ps.setString(2, p.getPname());
			ps.setInt(3, p.getQty());
			ps.setDouble(4, p.getPrice());
			ps.setString(5, p.getBrand());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteProduct(int pid) {
		
		String sql = "delete from product where pid = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, pid);
			ps.executeQuery(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateProduct(Product p) {
		
		String sql = "update product set price = ?, qty = ? where pid = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDouble(1, p.getPrice());
			ps.setInt(2, p.getQty());
			ps.setInt(3, p.getPid());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> retriveProductByName(String pname) {
		List<Product> products = new ArrayList<Product>();
		try {
			String sql = "Select * from product where pname = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, pname);
			ResultSet rs = ps.executeQuery(sql);
			while(rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setQty(rs.getInt(3));
				p.setPrice(rs.getDouble(4));
				p.setBrand(rs.getString(5));
				products.add(p);
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

	
	@Override
	public List<Product> retriveProdcutByPrice(double price) {
		List<Product> products = new ArrayList<Product>();
		try {
			String sql = "Select * from product where price = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDouble(1, price);
			ResultSet rs = ps.executeQuery(sql);
			while(rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setQty(rs.getInt(3));
				p.setPrice(rs.getDouble(4));
				p.setBrand(rs.getString(5));
				products.add(p);
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

}
