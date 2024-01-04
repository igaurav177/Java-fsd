package com.selenium.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.selenium.dbutil.DbUtil;
import com.selenium.pojo.Product;

public class ProductDAO_Impl implements ProductDAO {

	public int addProduct(Product product) throws ClassNotFoundException, SQLException {
		Connection conn=DbUtil.dbConn();
		if(conn!=null) {
			System.out.println("connected with db...");
		}
		String sql="insert into product values(?,?,?)";
		PreparedStatement st=conn.prepareStatement(sql);
		st.setInt(1, product.getPid());
		st.setString(2,product.getPname());
		st.setInt(3, product.getCost());
		return st.executeUpdate();
	}

	public int deleteProduct(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateProductName(int id, String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Product> selectProducts() throws ClassNotFoundException, SQLException {
		Connection conn=DbUtil.dbConn();
		if(conn!=null) {
			System.out.println("connected with db...");
		}
		String sql="select * from product";
		PreparedStatement st=conn.prepareStatement(sql);
		//select we use st.executeQuery
		ResultSet rs=st.executeQuery();
		List<Product> list=new ArrayList<Product>();
		//it gets the base address of the table 
		while(rs.next()) {  //1st row of the table
			Product product=new Product();
			product.setPid(rs.getInt("pid"));
			product.setPname(rs.getString("pname"));
			product.setCost(rs.getInt("pcost"));
			list.add(product);
		}
		
		return list;
	}

}
