/**
 * 
 */
package org.dimigo.exception;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.dimigo.interfaces.Action;

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

	public static void main(String[] args) {		
		
		RequestProcessor p = new RequestProcessor();
		InputStream is = p.getClass().getResourceAsStream("map.properties");
		
		if(is == null) {
			System.out.println("file load 실패");
		} else {
			
			Properties prop = new Properties();
			try {
				prop.load(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
			
			String actionName = prop.getProperty("delete");
			
			if(actionName == null) {
				System.out.println("등록된 action 정보가 없습니다.");
				return;
			}
			
			// 클래스로부터 객체를 생성해서 호출
			Class cls = null;
			try {
				cls = Class.forName(actionName);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
			
			Action action = null;
			try {
				action = (Action)cls.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}				
			action.execute();
		}
		
	}	

}
