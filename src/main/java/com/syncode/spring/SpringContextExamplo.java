package com.syncode.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syncode.spring.bean.FileEventType;


public class SpringContextExamplo {
	private ApplicationContext ctx;
	public SpringContextExamplo() {
       ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	public FileEventType getInstance1(){ 
		FileEventType file = (FileEventType)ctx.getBean("fileEventType", FileEventType.class);
		return file;
		
		

	}
	public FileEventType getInstance2(){ 
		FileEventType file = (FileEventType)ctx.getBean("fileEventType", FileEventType.class);
        return file;		
	}

}
