/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ ThreeDTv
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 22.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class ThreeDTv extends Tv {

	public ThreeDTv() {
		
	}
	
	public ThreeDTv(String model, String company) {
		super(model, company);
	}
	
	// 오버라이딩 메소드
	public void startService() {
		System.out.println("3D 입체 영상을 시작합니다.");
	}
	
	// ThreeDTv에만 있는 메소드
	public void watch3D() {
		System.out.println("3D 입체 영상을 봅니다.");
	}
	
	// 오버라이딩 메소드
	public void stopService() {
		System.out.println("3D 입체 영상을 종료합니다.");
	}
	
}
