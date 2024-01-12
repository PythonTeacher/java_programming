/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IBicycle
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 29.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public interface IBicycle {
	
	// 상수 선언 가능 (public static final이 붙음)
	int MIN_GEAR = 1;
	int MIN_SPEED = 0;
	
	// 추상메소드 선언 (public abstract이 붙음)
	void changeGear(int gear);
		
	void speedUp(int speed);
	
	void speedDown(int speed);
	
	// 디폴트 메소드 구현 (public 자동 붙음)
	default void setLight(boolean flag) {
		if(flag) System.out.println("불을 켭니다.");
		else System.out.println("불을 끕니다.");
	}
	
	// 정적 메소드 구현 (public 자동 붙음)
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
	
	
	
}
