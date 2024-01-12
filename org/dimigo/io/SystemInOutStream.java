/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;

/**
 * <pre>
 * org.dimigo.io
 *   |_ SystemInOut
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 28.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class SystemInOutStream {

	public static void main(String[] args) {
		
		try(InputStream is = System.in;
			PrintStream os = System.out;
			Reader reader = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(reader)) {
			
			// 표준 입력 스트림을 통해서 한 줄을 입력받고 
			// 표준 출력 스트림을 통해 출력하기
			os.print("문자열을 입력하세요 => ");
			
			int result;
			
//			while((result = is.read()) != '\n') {
//				os.println(result + " : " + (char)result);
//			}
			
//			while((result = reader.read()) != '\n') {
//				os.println(result + " : " + (char)result);
//			}
			
			System.out.println(br.readLine());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
