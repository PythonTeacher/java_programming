/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Korean
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 10.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Korean extends Person {

	public Korean(String name) {
		super(name);
	}
	
	// 메소드 오버라이딩
	public void sayHello() {
		System.out.println("안녕하세요~~");
	}
	
	public void sayBye() {
		System.out.println("안녕히 계세요~~");
	}
	
	public String toString() {
		return "저는 한국사람 " + name + "입니다.";
	}
	
}
