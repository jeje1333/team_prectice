package com.fintecho.littleforest.service;

import com.fintecho.littleforest.vo.Growing_TreeVO;

public interface Growing_TreeService {
//사용자의 나무 조회(사실상 재고 조회용)
Growing_TreeVO getAllStock(int user_id);

//사용자가 나무를 가지고 있는지 조회(count 활용)
boolean ifTree(int user_id);

//사용자 나무 등록 (사용자가 키우는 나무가 없을때)
int insertTree(int user_id);

//사용자가 비료 구매시 업데이트(포인트가 있을시)
void updatestock(int user_id);
}
