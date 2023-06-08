package com.spring.mugpet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mugpet.dao.PetDao;
import com.spring.mugpet.domain.Pet;


@Service
@Transactional
public class PetServiceImpl implements PetService {

	
	@Autowired
	private PetDao petDao;
	
	@Override
	public void addPet(Pet pet) {
		petDao.insertPet(pet);

	}

	@Override
	public Pet getPetByU_id(int u_id) {
		return petDao.getPetByU_id(u_id);
	}
	
	

}
