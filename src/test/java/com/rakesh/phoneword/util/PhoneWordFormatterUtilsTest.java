package com.rakesh.phoneword.util;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import org.junit.Assert;




/**
 * @author Rakesh Rathi
 * @since 2017-11-05
 */

@RunWith(JUnitPlatform.class)
public class PhoneWordFormatterUtilsTest {
	
	@Test
	public void testGetPhoneWords1() {
		
		Set<String> expected = new HashSet<String>();
		expected.add("1-800-CALL-ME");
		
		Set<String> leftWordParts = new HashSet<String>();
		leftWordParts.add("CALL");
		
		Set<String> rightWordParts = new HashSet<String>();
		rightWordParts.add("ME");
		
		Set<String> result = PhoneWordFormatterUtils.getPhoneWords(leftWordParts, rightWordParts);
		Assert.assertEquals("Match Not Found", result, expected);
	}
	
	@Test
	public void testGetPhoneWords2() {
		
		Set<String> expected = new HashSet<String>();
		expected.add("1-800-CALL-Z-ME");
		
		Set<String> leftWordParts = new HashSet<String>();
		leftWordParts.add("CALL");
		
		Set<String> rightWordParts = new HashSet<String>();
		rightWordParts.add("ME");
		
		Set<String> result = PhoneWordFormatterUtils.getPhoneWords(leftWordParts,'Z', rightWordParts);
		Assert.assertEquals("Match Not Found", result, expected);
	}
	
	
	@Test
	public void testGetPhoneWords3() {
		
		Set<String> expected = new HashSet<String>();
		expected.add("1-800-CALL-0");
		
		Set<String> leftWordParts = new HashSet<String>();
		leftWordParts.add("CALL");
		
		Set<String> result = PhoneWordFormatterUtils.getPhoneWords(leftWordParts,'0');
		Assert.assertEquals("Match Not Found", result, expected);
	}
	
	

	@Test
	public void testGetPhoneWords4() {
		Set<String> expected = new HashSet<String>();
		expected.add("1-800-0-CALL");
		
		Set<String> rightWordParts = new HashSet<String>();
		rightWordParts.add("CALL");
		
		Set<String> result = PhoneWordFormatterUtils.getPhoneWords('0', rightWordParts);
		Assert.assertEquals("Match Not Found", result, expected);
	}
	
	
	@Test
	public void testGetPhoneWords5() {
		
		Set<String> expected = new HashSet<String>();
		expected.add("1-800-CALL-AMZN");
		
		Set<String> leftWordParts = new HashSet<String>();
		leftWordParts.add("CALL");
		
		Set<String> rightWordParts = new HashSet<String>();
		rightWordParts.add("AMZN");
		
		Set<String> result = PhoneWordFormatterUtils.getPhoneWords(leftWordParts,rightWordParts);
		Assert.assertEquals("Match Not Found", result, expected);
	}
	
	
	@Test
	public void testHasValidValues() {
		Set<String> leftWordParts = new HashSet<String>();
		leftWordParts.add("CALL");
		
		Set<String> rightWordParts = new HashSet<String>();
		rightWordParts.add("AMZN");
		
		Assert.assertTrue("Sets are empty" ,PhoneWordFormatterUtils.hasValues(leftWordParts,rightWordParts));
	}
}
