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
 * 2. 작성일 : 2015. 9. 9.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class BasicException1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력 => ");
		int n1 = 0;
		try {
			n1 = scanner.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("숫자를 입력하세요!!");
			return;
		}
			
		System.out.println("두번째 숫자 입력 => ");
		int n2 = 0;
		try {
			n2 = scanner.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("숫자를 입력하세요!!");
			return;
		}
		
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
		
		scanner.close();
	}

}
