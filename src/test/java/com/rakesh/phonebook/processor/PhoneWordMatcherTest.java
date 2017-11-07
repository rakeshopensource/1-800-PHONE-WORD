package com.rakesh.phonebook.processor;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Rakesh Rathi
 * @since 2017-11-05
 */

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.rakesh.phoneword.dict.Dictionary;
import com.rakesh.phoneword.dict.DictionaryReader;

/**
 * @author Rakesh Rathi
 * @since 2017-11-05
 */

@RunWith(JUnitPlatform.class)
public class PhoneWordMatcherTest {
	
	private static PhoneWordMatcher phoneWordMatcher;
	
	@BeforeAll
	static void  setup() {
		phoneWordMatcher = new PhoneWordMatcher(new Dictionary(new DictionaryReader().loadDictionary()));
	}
	 	
	@Test
	public void testFindMatchExact() {
		Set<String> expected = new HashSet<String>();
		expected.add("1-800-APPLE");
		Set<String> result = phoneWordMatcher.match(27753);
		Assert.assertEquals("Match Not Found", result, expected);
	}
	
	
	@Test
	public void testFindMatchFuzzy() {
		Set<String> expected = new HashSet<String>();
		expected.add("1-800-2-AMZN");
		Assert.assertEquals("Match Not Found", phoneWordMatcher.match(22696), expected);
	}
	
}
