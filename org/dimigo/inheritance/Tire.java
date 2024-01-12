/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Tire
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 31.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Tire {

	private int size;		// 타이어 규격
	private int maxSpeed;	// 최대 속도
	
	/**
	 * @param size
	 * @param maxSpeed
	 */
	public Tire(int size, int maxSpeed) {
		super();
		this.size = size;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Tire [size=" + size + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
