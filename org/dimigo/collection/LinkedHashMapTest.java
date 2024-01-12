/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ HashMapTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 15.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class LinkedHashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String, List<String>> map = new LinkedHashMap<>();
		
		List<String> list = new ArrayList<String>();
		list.add("국어");
		list.add("수학");
		list.add("영어");
		
		map.put("월", list);
		
		list = new ArrayList<String>();
		list.add("수학");
		list.add("국어");
		list.add("영어");
		
		map.put("화", list);
		
		list = new ArrayList<String>();
		list.add("영어");
		list.add("국어");
		list.add("수학");
		
		map.put("수", list);
		
		list = new ArrayList<String>();
		list.add("수학");
		list.add("영어");
		list.add("국어");
		
		map.put("목", list);
		
		printMap(map);
	}
	
	public static void printMap(Map<String, List<String>> map) {
		for(String key : map.keySet()) {
			System.out.println(key + " => " + map.get(key));
		}
		System.out.println("-------------------------");
		
		for(Map.Entry<String, List<String>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
