/**
 * 
 */
package org.dimigo.collection;

import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ GSonTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 20.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class GSonTest {

	private static final String FILE_PATH = "C:/java_workspace/JavaClass/src/org/dimigo/collection/json_input.txt";
	
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
					
			String result;
			StringBuilder jsonString = new StringBuilder();
					
			// 1 라인씩 읽어오기
			while((result = br.readLine()) != null) {
				jsonString.append(result);
			}
			
			System.out.println(jsonString);
			
			Gson gson = new Gson();
		 
			// JSON --> Java
			Person person = gson.fromJson(jsonString.toString(), Person.class);
			System.out.println(person);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
