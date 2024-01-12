/**
 * 
 */
package org.dimigo.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * <pre>
 * org.dimigo.io
 *   |_ FileReaderWriter
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 28.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class FileReaderWriter {

	public static void main(String[] args) {
		try(Reader reader = new FileReader("files/input.txt");
			Writer writer = new FileWriter("files/output.txt")) {
			
			char[] buf = new char[100];
			int result;
			
			while((result = reader.read(buf)) != -1) {
				writer.write(buf, 0, result);
			}
			
			writer.write("\n요것도 출력되겠지롱!!!");
			
			System.out.println("파일 생성 완료!!!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}
