package com.rakesh.phonebook.processor;

import java.util.HashSet;
import java.util.Set;

import com.rakesh.phoneword.dict.Dictionary;

/**
 * @author Rakesh Rathi
 * @since 2017-11-05
 */

public class PhoneWordMatcher {
	
	private Dictionary dictionary;
	
	
	public PhoneWordMatcher(Dictionary dictionary) {
		this.dictionary = dictionary;
	}
	
	public Set<String> match(final Integer number) {
		 final Set<String> matches = new HashSet<>();
	         matches.addAll(dictionary.findMatch(number));
	        if (matches.isEmpty()) {
	        		matches.addAll(dictionary.findFuzzyMatch(number));
	        }
	        return matches;
		
	}
	
	
	

}
