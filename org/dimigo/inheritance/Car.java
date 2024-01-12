/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Car
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 31.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Car {

	private String model;
	
	// Has-a 관계 (전체와 부분 관계)
	private Engine engine;
	
	private Tire tire;

	public Car(String model, int engineCapacity, Tire tire) {
		super();
		this.model = model;
		// Car와 Engine의 생성과 소멸시점을 같이함 (lifecycle이 같음)
		this.engine = new Engine(engineCapacity);
		// Tire객체는 Car 객체와 무관하게 생성함
		this.tire = tire;
	}
	
	public void start() {
		System.out.println(model + " 시동을 걸다.");
		engine.startEngine();
	}
	
	public void stop() {
		System.out.println(model + " 시동을 끄다.");
		engine.stopEngine();
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", engine=" + engine + ", tire=" + tire
				+ "]";
	}
	
	
	
	
	
	
}
