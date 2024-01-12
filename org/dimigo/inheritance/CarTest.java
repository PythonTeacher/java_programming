/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ CarTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 31.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Car car1 = new Car("아우디", 2500, new Tire(200, 300));
		Car car2 = new Car("벤틀리", 3000, new Tire(250, 400));
		
		System.out.println(car1);
		car1.start();
		car1.stop();
		
		System.out.println(car2);
		car2.start();
		car2.stop();
		
		// 타이어 교체
		Tire newTire = new Tire(300, 500);
		car2.setTire(newTire);
		
		System.out.println(car2);
	}

}
