/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ TvTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 22.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class TvTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tv[] tvs = {
				new Tv("옛날 TV", "GoldStar"),
				new SmartTv("스마트 TV", "삼성"),
				new ThreeDTv("3D TV", "LG")
		};
		
		for(Tv tv : tvs) {
			tv.turnOn();
			
			// 반드시 Casting 전에 instanceof 연산자로 체크하기
			if(tv instanceof SmartTv) {
				SmartTv stv = (SmartTv)tv;
				stv.searchInternet();
			} else if(tv instanceof ThreeDTv) {
				ThreeDTv tdtv = (ThreeDTv)tv;
				tdtv.watch3D();
			}
			
			tv.turnOff();
			System.out.println();
		}

	}

}
