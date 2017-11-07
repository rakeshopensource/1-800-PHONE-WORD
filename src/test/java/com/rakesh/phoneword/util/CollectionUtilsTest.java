package com.rakesh.phoneword.util;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * @author Rakesh Rathi
 * @since 2017-11-05
 */

@RunWith(JUnitPlatform.class)
public class CollectionUtilsTest {
	
	@Test
	public void testIsEmpty() {
		Set<String> words = new HashSet<String>();
		words.add("CALL");

		System.out.println(CollectionUtils.isNotEmpty(null));
		Assert.assertFalse("Collection is not empty " ,CollectionUtils.isNotEmpty(null));
		Assert.assertFalse("Collection is not empty " ,CollectionUtils.isNotEmpty(new HashSet<String>()));
		Assert.assertTrue("Collection is empty " ,CollectionUtils.isNotEmpty(words));
		
	}
}
