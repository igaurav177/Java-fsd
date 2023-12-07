package com.product.pojo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductPojo {
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	  private String pname;
    private double pcost;
    @Temporal(TemporalType.DATE)
    private Date dateOfOrder;
    @Column(name = "file_path")
    private String fileUpload;
    

}
