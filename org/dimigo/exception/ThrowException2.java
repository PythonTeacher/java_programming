/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ ThrowException
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 9.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class ThrowException2 {

	public static void main(String[] args) {
		try {
			methodA(null, 0);
		} catch (Exception e) {
			System.out.println("main catch절");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}		
	}
	
	private static void methodA(String s, int i) throws Exception {
		methodB(s, i);
	}
	
	private static void methodB(String s, int i) throws Exception {
		try {
			if(s == null)
				throw new Exception("입력된 문자열이 없습니다.");
			
			if(i == 0)
				throw new Exception("0으로 나눌 수 없습니다.");
		} catch(Exception e) {
			System.out.println("methodB catch절");
			throw e;
		} finally {
			System.out.println("finally 절");
		}
		
		System.out.println("methodB 나머지 로직");
	}
	
	
	
	
	
	
	
}