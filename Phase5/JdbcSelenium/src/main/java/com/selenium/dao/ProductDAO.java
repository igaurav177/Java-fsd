package com.selenium.dao;

import java.sql.SQLException;
import java.util.List;

import com.selenium.pojo.Product;

public interface ProductDAO {
	//adding product
		public int addProduct(Product product) throws ClassNotFoundException, SQLException;
		//delete product
		public int deleteProduct(int id);
		//update product name
		public int updateProductName(int id,String name);
		//retrive product
		public List<Product> selectProducts() throws ClassNotFoundException, SQLException;

}
