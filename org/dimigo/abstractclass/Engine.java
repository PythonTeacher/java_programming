/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ Engine
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 27.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public abstract class Engine {

	private String type;
	
	public Engine(String type) {
		this.type = type;
	}
	
	// 추상메소드 선언
	public abstract void startEngine();
	public abstract void stopEngine();

	@Override
	public String toString() {
		return "Engine [type=" + type + "]";
	}
	
}
