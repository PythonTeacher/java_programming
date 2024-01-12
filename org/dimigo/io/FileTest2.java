/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * <pre>
 * org.dimigo.io
 *   |_ FileTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 28.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class FileTest2 {

	public static void main(String[] args) {
		InputStream is = FileTest2.class.getResourceAsStream("input.txt");
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
			
			System.out.println(br.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
