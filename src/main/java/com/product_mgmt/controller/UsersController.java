package com.product_mgmt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.product_mgmt.dto.UsersRequestDto;
import com.product_mgmt.dto.UsersResponseDto;
import com.product_mgmt.entity.Users;
import com.product_mgmt.service.UsersService;

public class UsersController {

	UsersService service;

	public UsersController(UsersService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/register")
	public String register(@RequestBody UsersRequestDto user) {
		return service.register(user);
	}
	
	@GetMapping("/searchUser/{id}")
	public UsersResponseDto searchUser(Long id) {
		return service.searchUser(id);
	}
	
	@GetMapping("/viewAllUsers")
	public List<UsersResponseDto> viewAllUsers(){
		return service.viewAllUsers();
	}
	
	@PutMapping("/updateUser")
	public String updateUser(Users user) {
		return service.updateUser(user);
	}
	
	@GetMapping("/searchUser/{id}")
	public String deleteUser(Long id) {
		return service.deleteUser(id);
	}
}
