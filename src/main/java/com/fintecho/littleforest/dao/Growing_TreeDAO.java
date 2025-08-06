package com.fintecho.littleforest.dao;

import org.apache.ibatis.annotations.Mapper;

import com.fintecho.littleforest.vo.Growing_TreeVO;

@Mapper
public interface Growing_TreeDAO {
//사용자가 보유한 나무의 전체 컬럼 내역 조회
Growing_TreeVO getAllStock(int user_id);

//사용자가 키우고 있는 나무 재고 조회 선언
int ifTree(int user_id);

//나무를 심는다
int insertTree(int user_id);

//유저가 비료 구매하는 것을 db에 업데이트
void updatestock(int user_id);
}
