/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ AccountTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 10.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class AccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account myAccount = null;
		try {
			myAccount = new Account("101-12345-123456", 10000);
			System.out.println(myAccount);
			
			AccountManager mgr = new AccountManager();
			mgr.setAccount(myAccount);
			
			mgr.deposit(20000);
			System.out.println(myAccount);
			
			mgr.withdraw(40000);
			System.out.println(myAccount);

		} catch(BizException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("알 수 없는 에러");
		}
	}

}
