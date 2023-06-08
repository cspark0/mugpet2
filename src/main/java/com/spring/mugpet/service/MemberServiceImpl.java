package com.spring.mugpet.service;

import java.io.File;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.spring.mugpet.dao.MemberDao;
import com.spring.mugpet.domain.MemberInfo;



@Service
public class MemberServiceImpl implements MemberService{

	
	@Autowired
	private MemberDao memberDao;
	private final String CURR_IMAGE_REPO_PATH = "/Users/hyouzl/test/";
	
	@Override
	public boolean login(String email,String pwd) {

		return false;
	}

	@Override
	public void creatAccount(MemberInfo account,MultipartFile file) throws Exception{
		String imgFileName = file.getOriginalFilename();
		
		System.out.println(imgFileName);
		
		UUID uuid = UUID.randomUUID();
		
	
		String saveFileName = uuid + "_" + imgFileName;
		account.setImageUrl(saveFileName);
		File saveImgfile = new File(CURR_IMAGE_REPO_PATH + saveFileName); 
		
		System.out.println(saveFileName);
		file.transferTo(saveImgfile);
		
		memberDao.insertAccount(account);
		
	}

	@Override
	public void updateAccount(MemberInfo account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberInfo checkAccount(String email, String pwd) {

		return null;
	}

	@Override
	public void creatAccountWithoutImgFile(MemberInfo account) throws Exception {
		account.setImageUrl("person.png");
		memberDao.insertAccount(account);
		
	}



	@Override
	public MemberInfo getMemberInfoByEmailandPwd(String email, String pwd) {
		return memberDao.getMemberInfoByEmailandPwd(email,pwd);
	}
	
	@Override
	public void updatePoints(int point, String email, String pwd) {
		memberDao.updatePoints(point, email, pwd);
	}
	
	

}
