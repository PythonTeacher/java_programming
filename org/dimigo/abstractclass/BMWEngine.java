/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ BMWEngine
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 27.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class BMWEngine extends Engine {

	public BMWEngine(String type) {
		super(type);
	}

	@Override
	public void startEngine() {
		// BMW 엔진 가동 기능 구현 (구체화)
		System.out.println("BMW 엔진 가동");
	}

	@Override
	public void stopEngine() {
		// BMW 엔진 멈춤 기능 구현 (구체화)
		System.out.println("BMW 엔진 멈춤");
	}
	
}
