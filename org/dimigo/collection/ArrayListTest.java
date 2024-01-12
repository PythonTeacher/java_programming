/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
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
public class ArrayListTest {

	public static void main(String[] args) {
		// 제네릭 (Generic) : List에 들어갈 데이터의 타입을 지정함
		List<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("배");
		list.add("딸기");
		list.add("딸기");
		list.add("딸기");
				
		printList(list);
		
//		list.add(10);		// new Integer(10)
//		list.add(3.14);		
		System.out.println(list.get(0));		
		System.out.println(list.get(list.size() - 1));
		System.out.println("----------------------------");
		
		list.add(1, "포도");
		printList(list);
		
		list.set(1, "바나나");
		printList(list);
		
		list.remove(0);
		printList(list);
		
		list.remove("딸기");
		printList(list);
		
		list.remove("키위");
		
		list.clear();
		printList(list);
	}
	
	// foreach 이용
	public static void printList(List<String> list) {
		for(String value : list) {
			System.out.println(value);
		}		
		System.out.println("----------------------------");
	}
	
	// Iterator 이용
	public static void printList1(List<String> list) {
		Iterator<String> i = list.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("----------------------------");
	}
	
}