/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Tv
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 22.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public abstract class AbstractTv implements TvIF {

	private String model;
	private String company;
	
	public AbstractTv() {
		
	}
	
	public AbstractTv(String model, String company) {
		this.model = model;
		this.company = company;
	}

	public void turnOn() {
		System.out.println(company + " " + model + "의 전원을 켭니다.");
		startService();
	}

	public void turnOff() {
		System.out.println(company + " " + model + "의 전원을 끕니다.");
		stopService();
	}

	protected abstract void startService();

	protected abstract void stopService();
}
