package com.syncode.spring;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syncode.springtest1.bean.FileEventType;


public class SpringContextExamplo {

	public FileEventType getInstance1(){ 
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		FileEventType file = (FileEventType)ctx.getBean("fileEventType");
		return file;

	}
	public FileEventType getInstance2(){ 
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		FileEventType file = (FileEventType)ctx.getBean("fileEventType");
		return file;
	}

}
