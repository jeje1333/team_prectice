package com.fintecho.littleforest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fintecho.littleforest.dao.Growing_TreeDAO;
import com.fintecho.littleforest.dao.UsersDAO;
import com.fintecho.littleforest.vo.Growing_TreeVO;

@Service
public class Growing_TreeServiceImpl implements Growing_TreeService{

	@Autowired
	private Growing_TreeDAO growing_TreeDAO;
	
	@Autowired
	private UsersDAO usersDAO;
	@Override
	public Growing_TreeVO getAllStock(int user_id) {
		return growing_TreeDAO.getAllStock(user_id);
	}
	@Override
	public boolean ifTree(int user_id) {
		// TODO Auto-generated method stub
		return growing_TreeDAO.ifTree(user_id)>0;
	}
	public int insertTree(int user_id) {
		if(!ifTree(user_id)) {
			
		return growing_TreeDAO.insertTree(user_id);
		}else {
			return 0;
		}
	}
	@Transactional
	public void updatestock(int user_id) {
		
		//usersDAO.updatepoint(user_seq);
		growing_TreeDAO.updatestock(user_id);
		
	}


}
