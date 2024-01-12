/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ DimiBank
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 10.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Account {
	private String accountNumber;
	private int balance;
	
	/**
	 * @param bankName
	 * @param accountNumber
	 * @param ownerName
	 */
	public Account(String accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance="
				+ balance + "]";
	}
	
}
