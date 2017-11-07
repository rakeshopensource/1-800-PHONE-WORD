package com.rakesh.phoneword.util;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * @author Rakesh Rathi
 * @since 2017-11-05
 */

@RunWith(JUnitPlatform.class)
public class DictionaryUtilsTest {
	
	@Test
	public void testGetNumber() {
		
		DictionaryUtils.getNumber('A');
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('A'), 2);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('B'), 2);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('C'), 2);
		
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('D'), 3);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('E'), 3);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('F'), 3);
		
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('G'), 4);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('H'), 4);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('I'), 4);
		
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('J'), 5);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('K'), 5);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('L'), 5);
		
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('M'), 6);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('N'), 6);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('O'), 6);
		
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('P'), 7);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('Q'), 7);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('R'), 7);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('S'), 7);
		
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('T'), 8);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('U'), 8);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('V'), 8);
		
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('W'), 9);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('X'), 9);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('Y'), 9);
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('Z'), 9);
		
		Assert.assertEquals("Match Not Found", DictionaryUtils.getNumber('$'), -1);
		
	}

}
