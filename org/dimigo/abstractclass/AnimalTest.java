/**
 * 
 */
package org.dimigo.abstractclass;


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
//		Animal a = new Animal();
		
		Animal[] animals = {
				new Duck(), new Pig(), new Cow()
		};
		
		System.out.println("=== 평온한 동물농장 ===");
		for(Animal animal : animals) {
			animal.eat();
		}
		
		System.out.println("=== 늑대가 나타났다!! ===");
		for(Animal animal : animals) {
			animal.bark();
		}
		
		
	}
	
}
