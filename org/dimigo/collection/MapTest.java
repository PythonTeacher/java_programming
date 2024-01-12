/**
 * 
 */
package org.dimigo.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MapTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 21.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<String, String>();
		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		
		long startTime1 = System.currentTimeMillis();
		
		for(int i=0; i<5000000; i++) {
			hashMap.put(String.valueOf(i), String.valueOf(i));
		}
		
		long endTime1 = System.currentTimeMillis();
		
		System.out.println("HashMap 걸린 시간 : " + (endTime1 - startTime1));
		
		long startTime2 = System.currentTimeMillis();
		
		for(int i=0; i<5000000; i++) {
			linkedHashMap.put(String.valueOf(i), String.valueOf(i));
		}
		
		long endTime2 = System.currentTimeMillis();
		
		System.out.println("LinkedHashMap 걸린 시간 : " + (endTime2 - startTime2));

	}

}
