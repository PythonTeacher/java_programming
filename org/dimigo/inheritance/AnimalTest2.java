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
public class AnimalTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal a = new Cat("야옹이");
//		a.dig();		// 컴파일 시에는 타입 기준으로 체크한다!!!
		
		a.bark();		// 오버라이딩한 경우에는 오버라이딩된 메소드가 실행된다!!
		
		// 자식 클래스에만 있는 메소드를 호출하려면 강제 형변환하기!!
		Cat c = (Cat)a;
		c.dig();
		
		((Cat) a).dig();
		
		// 실제 생성된 객체 타입으로 형변환하기
//		Dog d = (Dog)a;
		
		// instanceof 연산자
		Animal a1 = new Dog("멍멍이");
		Animal a2 = new Cat("야옹이");
		
		System.out.println(a1 instanceof Dog);
		System.out.println(a2 instanceof Cat);
		System.out.println(a1 instanceof Cat);
		System.out.println(a2 instanceof Dog);
		System.out.println(a1 instanceof Animal);
		System.out.println(a2 instanceof Animal);
		
		doAction(new Dog("멍멍이"));
		doAction(new Cat("냐옹이"));
		
	}
	
	private static void doAction(Animal a) {
		if(a == null) return;
		a.bark();
		
		if(a instanceof Cat) {
			Cat c = (Cat) a;
			c.dig();
			
//			((Cat) a).dig();
		}
	}
	
}
