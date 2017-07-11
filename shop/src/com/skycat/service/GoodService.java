package com.skycat.service;

import java.util.List;

import com.skycat.dao.GoodDao;
import com.skycat.entity.Good;

public class GoodService {
	private GoodDao goodDao;

	public void setGoodDao(GoodDao goodDao) {
		this.goodDao = goodDao;
	}
	
	public boolean add(Good good){
		return goodDao.add(good);	
	}
	public boolean delete(Good good){
		return goodDao.delete(good);	
	}
	public boolean update(Good oldGood,Good newGood){
		return goodDao.update(oldGood,newGood);	
	}
	public List<Good>getAll(){
		return goodDao.getAll();
	}
}
