package com.spring.dao;

import org.springframework.stereotype.Repository;

@Repository(value="perDao")
public class PerpDao implements PerDao {

	@Override
	public void save() {
		System.out.println("连接数据库。。。");
	}

}
