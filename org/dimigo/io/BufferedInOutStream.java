/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * <pre>
 * org.dimigo.io
 *   |_ BufferedInOutStream
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 28.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class BufferedInOutStream {

	public static void main(String[] args) {
		
		try(InputStream is = new FileInputStream("files/kakao.png");
			OutputStream os = new FileOutputStream("files/kakao_copy.png")) {
			
			int result;
			
			long start = System.currentTimeMillis();
			
			while((result = is.read()) != -1) {
				os.write(result);
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println("실행 속도 : " + (end - start));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(InputStream is = new FileInputStream("files/kakao.png");
			OutputStream os = new FileOutputStream("files/kakao_copy.png");
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os)) {
			
			int result;
			
			long start = System.currentTimeMillis();
			
			while((result = bis.read()) != -1) {
				bos.write(result);
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println("실행 속도 : " + (end - start));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
