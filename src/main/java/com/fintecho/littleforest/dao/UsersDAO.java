package com.fintecho.littleforest.dao;

import org.apache.ibatis.annotations.Mapper;

import com.fintecho.littleforest.vo.UsersVO;

@Mapper
public interface UsersDAO {
//해당 사원번호의 컬럼 전체 조회
UsersVO getinfrom(int user_seq);

//비료구매할때 포인트 차감용 업데이트
void updatepoint(int user_seq);
}
