package com.rakesh.phoneword.util;

import java.util.Collection;

/**
 * @author Rakesh Rathi
 * @since 2017-11-05
 */

public class CollectionUtils {

	public static boolean isNotEmpty(Collection obj) {
		return obj != null && obj.size() != 0;
	}
}
