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
@Table(name="menu")

public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  
	  @Column
	  private String emailID;
	  
	  @Column
	  private String passward;
	

}
