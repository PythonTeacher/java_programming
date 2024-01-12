/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Japanese
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 10.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Japanese extends Person {

	public Japanese(String name) {
		super(name);
	}
	
	// 메소드 오버라이딩
	public void sayHello() {
		System.out.println("오하요~~");
	}
	
	public void sayBye() {
		System.out.println("사요나라~~");
	}
	
	public String toString() {
		return "저는 일본사람 " + name + "입니다.";
	}
}
