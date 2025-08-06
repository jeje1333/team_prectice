package com.fintecho.littleforest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fintecho.littleforest.dao.UsersDAO;
import com.fintecho.littleforest.vo.UsersVO;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDAO usersDAO;

	@Override
	public UsersVO getinform(int user_seq) {
		// TODO Auto-generated method stub
		return usersDAO.getinfrom(user_seq);
	}
	
}
