package com.product_mgmt.controller;

import com.product_mgmt.service.UsersService;

public class UsersController {

	UsersService service;

	public UsersController(UsersService service) {
		super();
		this.service = service;
	}
}
