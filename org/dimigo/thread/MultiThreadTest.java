/**
 * 
 */
package org.dimigo.thread;

import java.util.Random;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ MultiThread
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 29.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class MultiThreadTest {

	public static void main(String[] args) {
				
		System.out.println("main thread start");
		
		Thread t1 = new TaskThread("one");
		Thread t2 = new TaskThread("two");
		
		// 익명클래스 : 이름이 없는 클래스
		// 한번 쓰고 버리는 일회용 클래스
		Thread t3 = new Thread() {
			String name = "three";
			int time = new Random().nextInt(10000);
			
			@Override
			public void run() {
				System.out.println(name + " start");
				System.out.println(name + "'s sleep time : " + time);
				
				try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(name + " end");
			}
		};
		
		// single thread 방식
//		t1.run();
//		t2.run();
		
		// multi thread 방식
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("main thread end");
		
	}
	
}
