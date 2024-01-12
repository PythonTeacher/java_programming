package org.dimigo.openapi;

//네이버 검색 API 예제 - blog 검색
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import org.dimigo.openapi.OpenAPIKey;

import com.fasterxml.jackson.databind.ObjectMapper;

public class NaverSearch {

    public static void main(String[] args) {
    	try {
			String json = search("movie");
			System.out.println(json);	// http://codebeautify.org/jsonviewer
			printResult(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public static String search(String target) throws Exception {
    	BufferedReader br = null;
    	try {
            String text = URLEncoder.encode("스타워즈", "UTF-8");
            // Documents > API 공통 가이드 > 네이버 오픈 API 목록
            // 블로그 : blog, 뉴스 : news, 책 : book, 영화 : movie
            String apiURL = "https://openapi.naver.com/v1/search/" + target + "?query="+ text; // json 결과
            
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", OpenAPIKey.NAVER_SEARCH_CLIENT_ID);
            con.setRequestProperty("X-Naver-Client-Secret", OpenAPIKey.NAVER_SEARCH_CLIENT_SECRET);
            
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
		
		System.out.println("lastBuildDate:" + map.get("lastBuildDate"));
		System.out.println("total:" + map.get("total"));
		List<Map<String, String>> list = (List<Map<String, String>>) map.get("items");
		
		int i = 0;
		for (Map<String, String> movie : list) {
			String title = movie.get("title").replaceAll("\\<.*?>","");
			String pubDate = movie.get("pubdate");
			System.out.printf("%d. %s [%s]\n", ++i, title, pubDate);
		}
    }
}