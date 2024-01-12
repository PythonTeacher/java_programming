/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ SyncTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 29.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class SyncTest {

	private int data;
	
	public static void main(String[] args) {
		SyncTest s = new SyncTest();
		
		Thread t1 = new Thread(new Runnable() {			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " start");
				s.add();
				System.out.println(Thread.currentThread().getName() + " end");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " start");
				s.add();
				System.out.println(Thread.currentThread().getName() + " end");
			}
		});
		
		t1.start();
		t2.start();
		
		// 다른 스레드가 완료될때까지 기다리기
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("data => " + s.data);
	}
	
	private void add() {
		for(int i=0; i<10000; i++) {
			synchronized (this) {
				data++;
			}			
		}
	}
		
	
	
}
