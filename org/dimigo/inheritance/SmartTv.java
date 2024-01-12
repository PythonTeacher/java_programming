/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartTv
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 22.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class SmartTv extends Tv {

	public SmartTv() {
		
	}
	
	public SmartTv(String model, String company) {
		super(model, company);
	}

	// 오버라이딩 메소드
	public void startService() {
		System.out.println("인터넷을 시작합니다.");
	}
	
	// SmartTv에만 있는 메소드
	public void searchInternet() {
		System.out.println("인터넷을 검색합니다.");
	}
	
	// 오버라이딩 메소드
	public void stopService() {
		System.out.println("인터넷을 종료합니다.");
	}
	
}
