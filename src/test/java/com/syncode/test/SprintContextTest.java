package com.syncode.test;


import static org.junit.Assert.assertSame;

import org.junit.Test;

import com.syncode.spring.SpringContextExamplo;
import com.syncode.spring.bean.FileEventType;

public class SprintContextTest {

	@Test
	public void testpegaInstanciaContexto() {
	  SpringContextExamplo spr = new SpringContextExamplo();	
	  FileEventType  file1 = spr.getInstance1();	
	  FileEventType file2 = spr.getInstance2();
	  assertSame(file1, file2); 
	}

}
