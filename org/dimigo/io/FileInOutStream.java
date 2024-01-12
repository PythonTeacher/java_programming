/**
 * 
 */
package org.dimigo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * <pre>
 * org.dimigo.io
 *   |_ FileInOutStream
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 28.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class FileInOutStream {

	public static void main(String[] args) {
		
		try(InputStream is = new FileInputStream("files/kakao.png");
			OutputStream os = new FileOutputStream("files/kakao_copy.png")) {
			
			int result;
			
//			while((result = is.read()) != -1) {
//				os.write(result);
//			}
			
			byte[] buf = new byte[100];
			
			while((result = is.read(buf)) != -1) {
				os.write(buf, 0, result);
			}
			
			System.out.println("파일 생성 완료!!!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
