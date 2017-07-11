package com.skycat.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.skycat.dao.GoodDaoJDBCImpl;

public class GoodServiceTest {

	@Test
	public void testGetAll() {
		GoodDaoJDBCImpl goodDaoJDBCImpl=new GoodDaoJDBCImpl();
		GoodService goodService=new GoodService();
		goodService.setGoodDao(goodDaoJDBCImpl);
		//List<good> goodList=goodService.getAll();
	}

}
