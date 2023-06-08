package com.spring.mugpet.dao.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.spring.mugpet.domain.Pet;

@Mapper
public interface PetMapper {

	
	void insertPet(Pet pet);
	Pet getPetByU_id(int u_id);
	
	
	
}
