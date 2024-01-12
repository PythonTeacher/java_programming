/**
 * 
 */
package org.dimigo.thread;

import java.util.Random;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ SingleThreadTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 29.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class SingleThreadTest {

	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.toString());
		
		int time = new Random().nextInt(10000);		// 0 ~ 9999
		System.out.println("first sleep time : " + time);
		
		// 특정시간동안 실행을 중지시킴
		// 실행 상태 -> 실행 대기 상태로 빠짐
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		time = new Random().nextInt(10000);		// 0 ~ 9999
		System.out.println("second sleep time : " + time);
		
		// 특정시간동안 실행을 중지시킴
		// 실행 상태 -> 실행 대기 상태로 빠짐
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main thread end");
		
	}

}
