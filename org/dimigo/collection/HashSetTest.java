/**
 * 
 */
package org.dimigo.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ HashSetTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 1.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class HashSetTest {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("사과");
		set.add("바나나");
		set.add("배");
		set.add("사과");		
		printSet(set);
		
		set.remove("배");
		printSet(set);
		
		// 짜장면, 짬뽕, 볶음밥
		List<String> list = Arrays.asList("짜장면", "짬뽕", "볶음밥", "짜장면", "짬뽕");
		
		Set<String> set2 = new HashSet<String>(list);
		System.out.println(set2);
	}
	
	public static void printSet(Set<String> set) {
		for(String v : set) {
			System.out.println(v);
		}
		System.out.println("---------------------");
	}
	
	
	
	
	
}
