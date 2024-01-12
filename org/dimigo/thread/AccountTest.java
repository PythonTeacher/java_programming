/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ AccountTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 29.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(10000);
		
		Thread t1 = new Thread(new Runnable() {			
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					account.deposit(2000);
				}				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {			
			@Override
			public void run() {
				for(int i=0; i<3; i++) {
					account.withdraw(3000);
				}				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("최종 잔액 : " + account.balance);
		
	}

}
