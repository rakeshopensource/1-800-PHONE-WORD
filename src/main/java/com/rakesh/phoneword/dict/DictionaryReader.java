package com.rakesh.phoneword.dict;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.rakesh.phoneword.util.DictionaryUtils;
import com.rakesh.phoneword.util.StringUtils;

/**
 * Class responsible to load dictionary on start-up.
 * 
 * @author Rakesh Rathi
 * @since 2017-11-05
 */

public class DictionaryReader {
	
	public static final String DICT_FILE = "dict.file";
	
	private Map<Integer, Set<String>> numberToWords= new ConcurrentHashMap<Integer, Set<String>>();
	
	public Map<Integer, Set<String>> loadDictionary() {
	       return processInputStream(getInputStream());
	}
	
	private InputStream getInputStream() {
		 String dictionaryFileLocation = System.getProperty(DICT_FILE);
	        InputStream inputStream = DictionaryReader.class.getResourceAsStream("dictionary");
	        if (!StringUtils.isEmpty(dictionaryFileLocation)) {
	            try {
	                inputStream = new FileInputStream(dictionaryFileLocation);
	            } catch (FileNotFoundException e) {
	                throw new IllegalArgumentException("File not found.", e);
	            }
	        }
	        return inputStream;
	}
	
	 private Map<Integer, Set<String>> processInputStream(final InputStream inputStream) {
	        if (inputStream == null) {
	            throw new IllegalArgumentException("Input Stream is null");
	        }
	        try (Scanner scanner = new Scanner(inputStream)) {
	            while (scanner.hasNext()) {
	            		String word = scanner.nextLine();
	            		Integer number = getNumberFromWord(word);
	            		if(number!=null) {
	            			addWord(number,word);
	            		}
	            }
	        }
	        return numberToWords;
	    }
	 
	 private Integer getNumberFromWord(final String word) {
		 final StringBuilder builder = new StringBuilder();
	      final String validString = StringUtils.removeInvalidCharacters(word.toUpperCase());
	        for (char c : validString.toCharArray()) {
	            int n = DictionaryUtils.getNumber(c);
	            if (n > 0) {
	                builder.append(n);
	            } else {
	                return null;
	            }
	        }
	       return  getNumberFromString(builder.toString());
		 
	 }
	 
	 private Integer getNumberFromString(String strNumber) {
		 Integer number = null;
		 try {
			 number = Integer.parseInt(strNumber);
		 } catch(NumberFormatException nfe) {
		
		 }
		 return number;
	 }
	 
	 private void addWord(final Integer number, final String word) {
		  Set<String> words = numberToWords.get(number);
	        if (words == null) {
	            words = new HashSet<String>();
	            numberToWords.put(number, words);
	        }
	        words.add(word);
	        numberToWords.put(number,words);
	 }

}
