/**
 * 
 */
package org.dimigo.abstractclass;

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
public abstract class Animal {
	// 나는 추상클래스다.
	// 내 자신은 직접 객체 생성할 수 없다.
	// 반드시 나를 상속받아 자식 객체를 만들어 써라.
	
	private String name;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("냠냠!!");
	}
	
	public void sleep() {
		System.out.println("쿨쿨!!");
	}
	
//	public void bark() {		
//		System.out.println("멍멍!!");
//	}

	// 추상메소드 선언
	// 반드시 자식 클래스에서 오버라이딩해야 한다!!!!!!!!!
	public abstract void bark();
	
	// 메소드 오버라이딩
	public String toString() {
		return "제 이름은 " + name + "입니다.";
	}
}





