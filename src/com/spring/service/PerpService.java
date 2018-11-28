package com.spring.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.PerDao;
@Service("perService")
public class PerpService implements PerService {
	@Resource(name="perDao") //根据名称注解
	//@Autowired //根据类型注解
	PerDao pd;
	public void setPd(PerDao pd) {
		this.pd = pd;
	}

	@Override
	public void save() {
		pd.save();
	}

}
