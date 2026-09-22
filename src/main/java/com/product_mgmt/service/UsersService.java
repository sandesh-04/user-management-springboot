package com.product_mgmt.service;

import java.util.List;

import com.product_mgmt.dto.UsersRequestDto;
import com.product_mgmt.dto.UsersResponseDto;
import com.product_mgmt.entity.Users;

public interface UsersService {

	String register(UsersRequestDto user);
	UsersResponseDto searchUser(Long id);
	List<UsersResponseDto> viewAllUsers();
	String updateUser(Users user);
	String deleteUser(Long id);
}
