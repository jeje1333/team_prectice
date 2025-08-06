package com.fintecho.littleforest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fintecho.littleforest.service.Growing_TreeService;
import com.fintecho.littleforest.service.UsersService;
/*import com.fintecho.littleforest.service.Growing_TreeService;*/
import com.fintecho.littleforest.vo.Growing_TreeVO;
import com.fintecho.littleforest.vo.UsersVO;

import jakarta.servlet.http.HttpSession;

@Controller
public class TreeController {

@Autowired
private Growing_TreeService growing_TreeService;

@Autowired
private UsersService usersService;

@GetMapping("/")
public String tree(Model model) {
	Growing_TreeVO vo=new Growing_TreeVO();
	int user_id=3;
	vo=growing_TreeService.getAllStock(user_id);
	UsersVO vo2=new UsersVO();
	int user_seq=3;
	vo2=usersService.getinform(user_seq);
	model.addAttribute("stock", vo);
	model.addAttribute("users", vo2);
	return "tree";
}
@GetMapping("/plant")
public String plant(Model model, HttpSession session) {
	Growing_TreeVO vo=new Growing_TreeVO();
	//int user_id=(int) session.getAttribute("user_id");
	int user_id=3;
	vo.setUser_id(user_id);
	return null;
	
}
}
