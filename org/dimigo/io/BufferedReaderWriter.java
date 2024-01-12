/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * <pre>
 * org.dimigo.io
 *   |_ BufferedReaderWriterTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 28.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class BufferedReaderWriter {

	public static void main(String[] args) {
		
		try(Reader reader = new FileReader("files/input.txt");
			Writer writer = new FileWriter("files/output.txt")) {
			
			int result;
			
			long start = System.currentTimeMillis();
			
			while((result = reader.read()) != -1) {
				writer.write(result);
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println("실행 속도 : " + (end - start));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(Reader reader = new FileReader("files/input.txt");
			Writer writer = new FileWriter("files/output.txt");
			BufferedReader br = new BufferedReader(reader);
			BufferedWriter bw = new BufferedWriter(writer)) {
			
			int result;
			
			long start = System.currentTimeMillis();
			
			while((result = br.read()) != -1) {
				bw.write(result);
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println("실행 속도 : " + (end - start));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
