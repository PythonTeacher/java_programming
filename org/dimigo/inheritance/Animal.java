/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Animal
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("냠냠!!");
	}
	
	public void sleep() {
		System.out.println("쿨쿨!!");
	}
	
	public void bark() {		
		System.out.println("멍멍!!");
	}

	// 메소드 오버라이딩
	public String toString() {
		return "제 이름은 " + name + "입니다.";
	}
}





