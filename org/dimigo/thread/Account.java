/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ Account
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 29.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Account {
	public int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	// 입금처리
	public void deposit(int money) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(this) {
			balance += money;
			System.out.println(money + "원 입금 => 현재 잔액 : " + balance);
		}
	}
	
	// 출금처리
	public void withdraw(int money) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(this) {
			if(balance >= money) {
				balance -= money;
				System.out.println(money + "원 출금 => 현재 잔액 : " + balance);
			}
		}
	}
	
	
	
	
	
	
	
	
}
