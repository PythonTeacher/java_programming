/**
 * 
 */
package org.dimigo.exception;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.dimigo.interfaces.*;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ RequestProcessor
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 29.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class RequestProcessor2 {

	public static void main(String[] args) {
		
		try {
			RequestProcessor2 p = new RequestProcessor2();
			InputStream is = p.getClass().getResourceAsStream("/org/dimigo/interfaces/map.properties");
			
			if(is == null) {
				System.out.println("file load 실패");
			} else {
				
				Properties prop = new Properties();
				prop.load(is);
				
				String actionName = prop.getProperty("delete");
				
				if(actionName == null) {
					System.out.println("등록된 action 정보가 없습니다.");
					return;
				}
				
				// 클래스로부터 객체를 생성해서 호출
				Action action = (Action)Class.forName(actionName).newInstance();
				
				action.execute();
			}
		
		} catch(Exception e) {
			if(e instanceof IOException) {
				System.out.println("파일을 로드하지 못했습니다.");
			} else if(e instanceof ClassNotFoundException) {
				System.out.println("클래스를 찾을 수 없습니다.");
			} else if(e instanceof InstantiationException ||
					  e instanceof IllegalAccessException) {
				System.out.println("객체 생성 시 실패했습니다.");
			} else {
				System.out.println("에러가 발생했습니다.");
			}
		}
		
//		} catch(IOException e) {
//			System.out.println("파일을 로드하지 못했습니다.");
//			e.printStackTrace();
//		} catch(ClassNotFoundException e) {
//			System.out.println("클래스를 찾을 수 없습니다.");
//		} catch(InstantiationException | IllegalAccessException e) {
//			System.out.println("객체 생성 시 실패했습니다.");
//		} catch(Exception e) {
//			System.out.println("에러가 발생했습니다.");
//			e.printStackTrace();
//		}
		
	}
	

}
