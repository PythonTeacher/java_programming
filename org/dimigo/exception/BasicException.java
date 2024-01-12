/**
 * 
 */
package org.dimigo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ BasicException
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 14.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class BasicException {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			
			System.out.println("첫번째 숫자 입력 => ");
			int n1 = scanner.nextInt();
			
			System.out.println("두번째 숫자 입력 => ");
			int n2 = scanner.nextInt();
			
			System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
			
		} catch(InputMismatchException e) {
			System.out.println("숫자를 입력하세요!!");
			e.printStackTrace();
		} finally {
			System.out.println("finally 실행");
			if(scanner != null)
				scanner.close();
		}
		
		
		
		
		
		
		
	}

}
