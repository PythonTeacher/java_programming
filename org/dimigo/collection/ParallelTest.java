/**
 * 
 */
package org.dimigo.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ ParallelTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 28.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class ParallelTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one", "two", "three", "four", "five");
		
		// 순차처리
		Stream<String> s = list.stream();
				
		System.out.println("<< 순차처리 >>");
		s.forEach(ParallelTest :: print);
//		s.forEach(value -> print(value));
	
		// 병렬 처리
		Stream<String> p = list.parallelStream();

		System.out.println("<< 병렬처리 >>");
		p.forEach(ParallelTest :: print);
	}

	public static void print(String value) {
		System.out.println(value + " : " + Thread.currentThread().getName());
	}

}
