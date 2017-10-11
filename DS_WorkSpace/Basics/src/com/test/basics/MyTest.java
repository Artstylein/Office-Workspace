package com.test.basics;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MyTest extends TestSuite {
	
	@Test
	public void test() {
		
		String test[]={"a","a","c","d"};
		String expc[]= {"a->201","c->12","d->13"};
	//	Result res = JUnitCore.runClasses(MapEgArr.class);
	//	assertEquals(Arrays.toString(expc), Arrays.toString(MapEgArr.fetch(test)));
		assertArrayEquals(expc, MapEgArr.fetch(test));
	}
	@Test
	public void rtest2(){
		assertEquals(true, MapEgArr.getV());
	}

}
