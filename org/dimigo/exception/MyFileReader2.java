/**
 * 
 */
package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * <pre>
 * org.dimigo.exception
 *   |_ FileTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 9.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class MyFileReader2 {
	public static final String PATH = "C:\\java_workspace\\JavaClass\\src\\org\\dimigo\\exception\\input.txt";
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(
				new FileReader(PATH))) {
			
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일을 읽는 중 오류가 발생했습니다.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		
		
		
		
		
		
		

	}

}
