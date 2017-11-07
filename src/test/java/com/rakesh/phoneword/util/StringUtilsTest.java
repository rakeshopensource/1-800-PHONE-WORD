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
public class StringUtilsTest {

	@Test
	public void testRemoveInvalidCharacters() {
	    String expected = "225563";
		String result = StringUtils.removeInvalidCharacters("2255.63");
		Assert.assertEquals("Match Not Found", result, expected);
	}
	
	@Test
	public void testAppendTollFreePrifix() {
		 String expected = "1-800-225563";
	     String result = StringUtils.appendTollFreePrifix("225563");
	     Assert.assertEquals("Match Not Found", result, expected);
	}
	
	@Test
	public void testCleanInput() {
		 int expected = 225563;
	     int result = StringUtils.cleanInput("1-800-2255.63");
		 Assert.assertEquals("Match Not Found", result, expected);
	}
	
	
	@Test
	public void testIsEmpty() {
		 Assert.assertTrue("String not empty" ,StringUtils.isEmpty("  "));
		 Assert.assertTrue("String not empty" ,StringUtils.isEmpty(null));
		 Assert.assertFalse("String is empty" ,StringUtils.isEmpty("22"));
	}
}
