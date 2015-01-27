package com.syncode.spring.bean;



public class DefaultServiceLocator {
	public static FileEventType fileEvent = new FileEventType();
	
	public FileEventType createSpringContextExemplo(){
		return fileEvent;

	}

}
