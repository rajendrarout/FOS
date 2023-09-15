package com.raju.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="bill")

public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  
	  @Column
	  private String billNo;
	  
	  @Column
	  private String price;
	  @Column
	  private String costomerName;
	  @Column
	  private String phomeNumber;
	  @Column
	  private String place;

}
