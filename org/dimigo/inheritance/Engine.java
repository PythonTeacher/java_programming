/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Engine
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 31.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Engine {

	private int engineCapacity;		// 배기량

	/**
	 * @param engineCapacity
	 */
	public Engine(int engineCapacity) {
		super();
		this.engineCapacity = engineCapacity;
	}
	
	public void startEngine() {
		System.out.println("엔진을 켭니다.");
	}
	
	public void stopEngine() {
		System.out.println("엔진을 끕니다.");
	}

	@Override
	public String toString() {
		return "Engine [engineCapacity=" + engineCapacity + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
