package com.spring.mugpet.domain;

import java.util.Date;

public class UsedGoods {
	private int g_id;				//primary key
	private int imageUrl;			//이미지 경로
	private String title;			//제목
	private String content;			//내용
	private Date enrollDt;			//작성시간
	private int price;				//가격
	private int likes;				//좋아요 수
	private int replyCnt;			//댓글 수
	private int u_id;				//작성자 id
	
	public UsedGoods() {}
	
	public UsedGoods(int g_id, int imageUrl, String title, String content, Date enrollDt, int price, int likes,
			int replyCnt, int u_id) {
		this.g_id = g_id;
		this.imageUrl = imageUrl;
		this.title = title;
		this.content = content;
		this.enrollDt = enrollDt;
		this.price = price;
		this.likes = likes;
		this.replyCnt = replyCnt;
		this.u_id = u_id;
	}

	public int getG_id() {
		return g_id;
	}

	public void setG_id(int g_id) {
		this.g_id = g_id;
	}

	public int getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(int imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getEnrollDt() {
		return enrollDt;
	}

	public void setEnrollDt(Date enrollDt) {
		this.enrollDt = enrollDt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getReplyCnt() {
		return replyCnt;
	}

	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
}
