package com.rakesh.phoneword.dict;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * @author Rakesh Rathi
 * @since 2017-11-05
 */

@RunWith(JUnitPlatform.class)
public class DictionaryTest {
	
	private static  Dictionary dictionary;
	@BeforeAll
	static void  setup() {
		dictionary = new Dictionary(new DictionaryReader().loadDictionary());
	}
	 	
	@Test
	public void testFindMatch() {
		Set<String> expected = new HashSet<String>();
		expected.add("1-800-APPLE");
		Assert.assertEquals("Match Not Found", dictionary.findMatch(27753), expected);
	}
	
	
	@Test
	public void testfindFuzzyMatch() {
		Set<String> expected = new HashSet<String>();
		expected.add("1-800-2-AMZN");
		Assert.assertEquals("Match Not Found", dictionary.findFuzzyMatch(22696), expected);
	}

	@Test
	public void testfindFuzzyMatchWordWord() {
		Set<String> expected = new HashSet<String>();
		expected.add("1-800-CALL-ME");
		Assert.assertEquals("Match Not Found", dictionary.findFuzzyMatch(225563), expected);
	}
	
	



}
