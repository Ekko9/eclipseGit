package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo01 {
	
	
	/*public Demo01() {
		System.out.println("构造。。。。。");
	}
*/
	public void eat() {
		System.out.println("吃饭......");
	}

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		Demo01 f  = (Demo01) ap.getBean("f");
		f.eat();
	}

}
