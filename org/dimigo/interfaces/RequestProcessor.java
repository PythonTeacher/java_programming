/**
 * 
 */
package org.dimigo.interfaces;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
public class RequestProcessor {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException  {
		
		RequestProcessor p = new RequestProcessor();
		InputStream is = p.getClass().getResourceAsStream("map.properties");
		
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
			Class<?> cls = Class.forName(actionName);
			Action action = (Action)cls.newInstance();
			
			action.execute();
		}
		
		
	}
	
	
	

}
