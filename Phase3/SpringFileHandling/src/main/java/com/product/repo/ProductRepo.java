package com.product.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.pojo.ProductPojo;


public interface ProductRepo extends JpaRepository<ProductPojo, Integer>{

	public Optional<ProductPojo> findByName(String fileupload);
	public Optional<ProductPojo> findByPname(String pname);


}
