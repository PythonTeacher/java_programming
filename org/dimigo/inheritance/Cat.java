/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Cat
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Cat extends Animal {
	
	public Cat(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println("야옹!!");
	}	
		
	// Cat에만 있는 메소드 추가
	public void dig() {
		System.out.println("땅을 판다!!!");
	}
	
	
	
}
