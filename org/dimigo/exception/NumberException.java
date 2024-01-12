/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ NullException
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 9.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class NumberException {

	public static void main(String[] args) {
		
		try {
			String str = "123";
			int i = Integer.parseInt(str);
			
			str = null;
			System.out.println(str.length());
		} catch(NumberFormatException e) {
			System.out.println("숫자 형식이 아닙니다.");
		} catch(Exception e) {
			System.out.println("에러가 발생했습니다.");
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
	}

}