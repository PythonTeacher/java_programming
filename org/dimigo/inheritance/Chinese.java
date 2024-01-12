/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Chinese
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 10.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Chinese extends Person {

	public Chinese(String name) {
		super(name);
	}
	
	// 메소드 오버라이딩
	public void sayHello() {
		System.out.println("니하오~~");
	}
	
	public void sayBye() {
		System.out.println("쨔이찌엔~~");
	}
	
	public String toString() {
		return "저는 중국사람 " + name + "입니다.";
	}
}
