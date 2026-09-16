package com.product_mgmt.service;

import org.springframework.stereotype.Service;

import com.product_mgmt.repository.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService{
	
	UsersRepository repo;

	public UsersServiceImplementation(UsersRepository repo) {
		super();
		this.repo = repo;
	}
	
	
}
