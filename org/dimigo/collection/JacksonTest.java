/**
 * 
 */
package org.dimigo.collection;

import java.io.BufferedReader;
import java.io.FileReader;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ JacksonTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 20.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class JacksonTest {

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
			
			ObjectMapper mapper = new ObjectMapper();
			
			Person person = mapper.readValue(jsonString.toString(), Person.class);
			System.out.println(person);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
