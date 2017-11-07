package com.rakesh.phoneword.util;

/**
 * @author Rakesh Rathi
 * @since 2017-11-05
 */

public final class StringUtils {
	
	public static String removeInvalidCharacters(final String value) {
		if (value != null) {
			final String cleanString = value.replaceAll("\\W", "");
			return (cleanString.isEmpty()) ? null : cleanString;
		}
		return null;
	}

	public static Integer cleanInput(final String numberAsString) {
		String cleanString = removeInvalidCharacters(numberAsString);

		Integer number = null;
		if (cleanString != null) {
			cleanString = cleanString.replaceFirst("1800", "");
			try {
				number = Integer.valueOf(cleanString);
			} catch (NumberFormatException e) {
				number = null;
			}
		}
		return number;
	}

	public static String appendTollFreePrifix(String... elements) {
		final StringBuilder builder = new StringBuilder("1-800");

		for (String element : elements) {
			builder.append("-").append(element);
		}
		return builder.toString();
	}

	public static boolean isEmpty(final String value) {
		return (value == null || value.isEmpty() || value.trim().isEmpty());
	}
}
