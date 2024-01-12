/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ InterruptTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 29.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class InterruptTest {

	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name + " start");
				
				while(true) {
					System.out.println(name + " is running.");
					
					if(Thread.interrupted()) {
						System.out.println("실행 중 interrupt 됨");
						break;
					}
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println("sleep 중에 interrupt 됨");
						break;
					}
				}
				
				System.out.println(name + " end");
			}
		});
		
		t.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t.interrupt();
		
		
		
		
		
		
		
		
	}

}
