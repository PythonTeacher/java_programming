/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ BenzEngine
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 27.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class BenzEngine extends Engine {

	public BenzEngine(String type) {
		super(type);
	}
	
	@Override
	public void startEngine() {
		// Benz 엔진 가동 기능 구현 (구체화)
		System.out.println("Benz 엔진 가동");
	}

	@Override
	public void stopEngine() {
		// Benz 엔진 멈춤 기능 구현 (구체화)
		System.out.println("Benz 엔진 멈춤");
	}

}
