/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ ArrayListTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 12.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class ArrayListTest2 {

	public static void main(String[] args) {		
		// ArrayList를 생성하고, 슈퍼맨, 배트맨, 스파이더맨을 담아보자
		List<String> list = new ArrayList<String>();
		
		list.add("슈퍼맨");
		list.add("배트맨");
		list.add("스파이더맨");
		
		System.out.println(list);
		
		List<String> list2 = Arrays.asList("슈퍼맨2", "배트맨2", "스파이더맨2");
		System.out.println(list2);
		
		
		list.addAll(list2);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		// list -> array
		String[] arr = new String[list.size()];
		list.toArray(arr);
		
		for(String v : arr) {
			System.out.println(v);
		}
		
		// array -> list
		List<String> list3 = Arrays.asList(arr);
		System.out.println(list3);
		
		
		List<String> newList = Arrays.asList(new String[]{"d","e","f"});
		System.out.println(newList);
	}

}