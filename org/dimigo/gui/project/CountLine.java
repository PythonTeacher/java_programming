/**
 * 
 */
package org.dimigo.gui.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * org.dimigo.gui.project
 *   |_ CountLine
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 12. 12.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class CountLine {

	public static final String DIR_PATH = "D:\\자바프로그래밍\\08.프로젝트과제\\제출파일\\2-6반";
	
	public static void main(String[] args) {
		File root = new File(DIR_PATH);
		
		File[] files = root.listFiles();
		
		for(File file : files) {
			int lineSum = processDirectory(file, "java");		   
			System.out.println(file.getName() + " : " + lineSum);
		}
	}

	private static int processDirectory(File directory, String extension) {
		File[] files = directory.listFiles();
		  
		int lineCount = 0;
		  
		for (File file : files) {
		
			// 디렉토리인 경우. 재귀호출.
			if (file.isDirectory()) {
				lineCount += processDirectory(file, extension);
			}
		   
			// 일반 파일인 경우.
			else {
				if (file.getName().toLowerCase().endsWith("." + extension.toLowerCase())) {
					lineCount += countLines(file);
				}
			}
		}
		  
		return lineCount;
	}
	
	private static int countLines(File file) {
		BufferedReader bufferedReader = null;
		  
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		   
			int count = 0;
			while (bufferedReader.readLine() != null) count++;
		   
			return count;
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			return 0;
		} catch (IOException ex) {
			ex.printStackTrace();
			return 0;
		} finally {
			try {
				if (bufferedReader != null) bufferedReader.close();
			} catch (IOException ex2) {
				
			}
		}
	}
}
