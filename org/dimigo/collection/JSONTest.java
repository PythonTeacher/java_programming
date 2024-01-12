package org.dimigo.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ JSONTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 12.
 * </pre>
 *
 * @author		: 이름
 * @version		: 1.0
 */
public class JSONTest {

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
			
			// JSON String을 Parsing하여 Person 객체에 담기
			JSONParser jsonParser = new JSONParser();
			
			// 문자열을 JSON 객체로 변환
			JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonString.toString());
			
			Person person = new Person();
			
			person.setName((String)jsonObject.get("name"));
			person.setAge(((Long)jsonObject.get("age")).intValue());
			
			// address값 셋팅하기
			JSONObject address = (JSONObject)jsonObject.get("address");
//			person.setSido((String)address.get("sido"));
//			person.setDong((String)address.get("dong"));
//			person.setDetailAddress((String)address.get("detailAddress"));
			
			// PhoneNumbers 셋팅하기
			JSONArray phoneNumbers = (JSONArray)jsonObject.get("phoneNumbers");
			int size = phoneNumbers.size();
			List<Phone> phoneList = new ArrayList<Phone>(size);
			
			for(int i=0; i<size; i++) {
				JSONObject phone = (JSONObject)phoneNumbers.get(i);
				
				Phone p = new Phone();
				p.setType((String)phone.get("type"));
				p.setNumber((String)phone.get("number"));
				
				phoneList.add(p);
			}
			
			person.setPhoneNumbers(phoneList);
			
			System.out.println(person);
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}	

}
