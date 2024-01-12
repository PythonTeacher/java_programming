/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ AccountManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 10.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class AccountManager {

	private Account account;
	
	public void setAccount(Account account) {
		this.account = account;
	}
		
	public void deposit(int money) throws Exception {
		if(money < 1000) {
			throw new BizException("최소 입금 금액 1000원 (거래액 : " + money + "원)");
		}
		
		account.setBalance(account.getBalance() + money);
		System.out.println(money + "원 입금되었습니다.");
	}

	public void withdraw(int money) throws Exception {
		if(money < 500) {
			throw new BizException("최소 출금 금액 500원 (거래액 : " + money + "원)");
		}
		
		if(account.getBalance() < money) {
			throw new BizException("잔고 부족 (현재잔고 : " + account.getBalance() + "원, 거래액 : " + money + "원)");
		}
		
		account.setBalance(account.getBalance() - money);
		System.out.println(money + "원 출금되었습니다.");
	}
	
}
