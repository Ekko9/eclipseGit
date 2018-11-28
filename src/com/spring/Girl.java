package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Girl {

	Boy b;
	Integer uid;
	String uname;
	List<Object> list;
	Set<Object> set;
	Map<String, Object> map;
	Object[] arrays;

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public void setArrays(Object[] arrays) {
		this.arrays = arrays;
	}

	public void setB(Boy b) {
		this.b = b;
	}

	public void hi() {
		b.di();
		System.out.println(uid + "====" + uname);
		System.out.println("============================");
		for (Object object : arrays) {
			System.out.println("arrays:" + object);
		}
		System.out.println("============================");
		for (Object object : list) {
			System.out.println("list:" + object);
		}
		System.out.println("============================");
		for (Object object : set) {
			System.out.println("set:" + object);
		}
		System.out.println("============================");
		Set<String> keySet = map.keySet();

		for (Object object : keySet) {
			System.out.println("key:" + object + ";value:" + map.get(object));
		}
	}
}
