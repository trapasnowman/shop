package com.skycat.dao;

import com.skycat.entity.*;
import java.util.List;
public interface GoodDao {
	public boolean add(Good good);
	public boolean delete(Good good);
	public boolean update(Good oldgood,Good newgood);
	public List<Good> getAll();
}
