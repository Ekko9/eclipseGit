package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.spring.service.PerpService;

public class Test {


	public static void main(String[] args) {
		//相对路径
	    // ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/spring.xml");
		// 文件绝对路径
		ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\WorkSpace\\four01\\src\\com\\spring\\spring.xml");
		//BeanFactory ac = new XmlBeanFactory(new FileSystemResource("D:\\WorkSpace\\four01\\src\\com\\spring\\spring.xml"));
		/*
		 * Girl g = (Girl) ap.getBean("g"); 
		 * g.hi();
		 */
		PerpService ps = (PerpService) ac.getBean("perService");
		ps.save();
	}

}
