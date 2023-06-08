package com.spring.mugpet.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.spring.mugpet.controller.community.NewCommunityCommand;
import com.spring.mugpet.domain.Community;

@Mapper
public interface CommunityMapper {
	public List<Community> getComList(); /*커뮤니티 전체 글 목록*/
	
	public List<Community> getMemberComList(int u_id); /*member가 쓴 글 목록*/
	
	public Community getCom(int com_id); /*글 상세보기*/
	
	public void insertCom(NewCommunityCommand comCommand); /*커뮤니티 글 추가*/
	
	public void updateCom(NewCommunityCommand comCommand); /*커뮤니티 글 수정*/
	
	public void deleteCom(int com_id); /*커뮤니티 글 삭제*/

	public void updateReplyCnt(@Param("com_id") int com_id, @Param("amount") int amount);
}
