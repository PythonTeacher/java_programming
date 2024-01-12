/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ ListTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 12.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		
		long startTime1 = System.currentTimeMillis();
		
		for(int i=0; i<300000; i++) {
			linkedList.add(0, i + "");
		}
		
		long endTime1 = System.currentTimeMillis();
		
		System.out.println("LinkedList 걸린 시간 : " + (endTime1 - startTime1));
		
		long startTime2 = System.currentTimeMillis();
		
		for(int i=0; i<300000; i++) {
			arrayList.add(0, i + "");
		}
		
		long endTime2 = System.currentTimeMillis();
		
		System.out.println("ArrayList 걸린 시간 : " + (endTime2 - startTime2));
		
		

	}

}
