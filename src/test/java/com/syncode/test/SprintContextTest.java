package com.syncode.test;


import static org.junit.Assert.*;
import com.syncode.springtest1.bean.*;
import com.syncode.spring.*;

import org.junit.Test;

public class SprintContextTest {

	@Test
	public void testpegaInstanciaContexto() {
	  SpringContextExamplo spr = new SpringContextExamplo();	
	  FileEventType  file1 = spr.getInstance1();	
	  FileEventType file2 = spr.getInstance2();
	  assertEquals(file1, file2); 
	}

}
