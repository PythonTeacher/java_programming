/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ Dog
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 31.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
}
