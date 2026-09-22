package com.product_mgmt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product_mgmt.dto.UsersRequestDto;
import com.product_mgmt.dto.UsersResponseDto;
import com.product_mgmt.entity.Users;
import com.product_mgmt.repository.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService{
	
	UsersRepository repo;

	public UsersServiceImplementation(UsersRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String register(UsersRequestDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsersResponseDto searchUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsersResponseDto> viewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
