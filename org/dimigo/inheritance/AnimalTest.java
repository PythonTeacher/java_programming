/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ AnimalTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class AnimalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Dog d = new Dog("멍멍이");
		System.out.println(d);
		d.bark();		// Animal.bark()

		Cat c = new Cat("야옹이");
		System.out.println(c);
		c.bark();		// Cat.bark()
		
		Tiger t = new Tiger("호돌이");
		System.out.println(t);
		t.bark();		// Tiger.bark()
		
		// Object 클래스의 메소드
		System.out.println(d.equals(new Dog("멍멍이")));
		
		// 부모 타입으로 Upcasting하기
		Animal a1 = new Dog("멍멍이");
		a1.bark();
		
		Animal a2 = new Cat("야옹이");
		a2.bark();
		
		Animal a3 = new Tiger("호돌이");
		a3.bark();
		
		System.out.println("-------------------");
		
		// 배열로 처리하기
		Animal[] animals = {
				new Dog("멍멍이"), new Cat("야옹이"), new Tiger("호돌이")
		};
		
		for(Animal a : animals) {
			System.out.println(a);
			a.bark();
			doBark(a);
		}
		
		System.out.println("-----------------------");
			
		// 객체간 교체가 가능하다 (인터페이스에서 다룰 내용)
		Animal a = new Dog("멍멍이");
		a = new Cat("야옹이");
	}
	
	private static void doBark(Animal a) {
		System.out.println(a);
		a.bark();
	}
	
	
	
	
	
	
}
