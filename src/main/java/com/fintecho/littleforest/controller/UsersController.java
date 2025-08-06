package com.fintecho.littleforest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fintecho.littleforest.service.UsersService;

@Controller
public class UsersController {

	@Autowired
	private UsersService usersService;
	
}
