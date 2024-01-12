package org.dimigo.openapi;

//네이버 기계번역 API 예제
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import org.dimigo.openapi.OpenAPIKey;

import com.fasterxml.jackson.databind.ObjectMapper;

public class NaverTranslator {

    public static void main(String[] args) {
    	try {
			String json = translate();
			System.out.println(json);
			printResult(json);
		} catch (Exception e) {
			e.printStackTrace();
		}    	
    }
    
    private static String translate() throws Exception {
    	BufferedReader br = null;
    	try {
            String text = URLEncoder.encode("만나서 반갑습니다.", "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/language/translate";
            
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            
            con.setRequestMethod("POST");
            con.setRequestProperty("X-Naver-Client-Id", OpenAPIKey.NAVER_TRANSLATE_CLIENT_ID);
            con.setRequestProperty("X-Naver-Client-Secret", OpenAPIKey.NAVER_TRANSLATE_CLIENT_SECRET);
            
            // post request
            // 한국어:ko, 영어:en, 일본어:ja, 중국어(간체):zh-CN
            String postParams = "source=ko&target=en&text=" + text;
            con.setDoOutput(true);
            
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(postParams);
            wr.flush();
            wr.close();
            
            int responseCode = con.getResponseCode();
            
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            
            String inputLine;
            StringBuffer response = new StringBuffer();
            
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            return response.toString();
        } catch (Exception e) {
            throw e;
        } finally {
        	br.close();
        }
    }

	@SuppressWarnings("unchecked")
	private static void printResult(String json) throws Exception {
    	Map<String, Object> map = new ObjectMapper().readValue(json, Map.class);
    	
		Map<String, Object> message = (Map<String, Object>) map.get("message");
		System.out.println(message.get("@type"));
		
		Map<String, String> result = (Map<String, String>) message.get("result");
		System.out.println(result.get("translatedText"));
    }

}