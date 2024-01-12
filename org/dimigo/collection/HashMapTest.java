/**
 * 
 */
package org.dimigo.collection;

import java.util.HashMap;
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
public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("kor", 100);
		map.put("mat", 92);
		map.put("eng", 95);
		
		printMap(map);
		
		System.out.println(map.get("kor"));
		System.out.println(map.get("sci"));	// 없는 key로 get하면 null이 나옴
		System.out.println("----------------------------");
		
		map.remove("mat");
		printMap(map);
		
		map.replace("kor", 95);
		printMap(map);
		
		map.put("java", 100);
		printMap(map);
		
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, Integer> map) {
		for(String key : map.keySet()) {
			System.out.println(key + " => " + map.get(key));
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " =>" + entry.getValue());
		}
		
		map.forEach((key, value) -> System.out.println(key + " => " + value));
		
		System.out.println("----------------------------");
	}	

}
