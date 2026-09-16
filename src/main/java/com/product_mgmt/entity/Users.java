package com.product_mgmt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {

	@Id
	Long id;
	String username;
	String password;
	
}
