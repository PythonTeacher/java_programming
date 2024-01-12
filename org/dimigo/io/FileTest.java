/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
public class FileTest {

	public static void main(String[] args) {
		File f1 = new File("files/output2.txt");
		File f2 = new File("files/output3.txt");
		
		try(BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
			BufferedWriter bw2 = new BufferedWriter(new FileWriter(f2, true));
			BufferedReader br1 = new BufferedReader(new FileReader(f1));
			BufferedReader br2 = new BufferedReader(new FileReader(f2))) {
			
			// 파일 쓰기
			bw1.write("안동찜닭 맛있었다..");
			bw2.write("저녁메뉴는 뭘까?");
			
			bw1.flush();
			bw2.flush();
			
			// 파일 읽기
			System.out.println("첫번째 파일 내용 : " + br1.readLine());
			System.out.println("두번째 파일 내용 : " + br2.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
