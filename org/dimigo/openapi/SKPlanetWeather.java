/**
 * 
 */
package org.dimigo.openapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <pre>
 * org.dimigo.openapi
 *   |_ MelonChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 10.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class SKPlanetWeather {

	public static void main(String[] args) {
    	try {
			String json = search();
			System.out.println(json);	// http://codebeautify.org/jsonviewer
			printResult(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public static String search() throws Exception {
    	BufferedReader br = null;
    	try {
    		// 37.341867, 126.831475
    		// 위도(latitude) : 지구상에서 적도를 기준으로 북쪽 또는 남쪽으로 얼마나 떨어져 있는지 나타내는 위치 (가로줄)
    		// 경도 (longitude) : 지구상에서 본초 자오선을 기준으로 동쪽 또는 서쪽으로 얼마나 떨어져 있는지 나타내는 위치 (세로줄)
            String apiURL = "http://apis.skplanetx.com/weather/current/hourly?version=1&lat=37.341867&lon=126.831475";
            
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            
            con.setRequestMethod("GET");
            con.setRequestProperty("appKey", OpenAPIKey.SKPLANET_WEATHER_APP_KEY);
            
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
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private static void printResult(String json) throws Exception {
    	Map<String, Object> map = new ObjectMapper().readValue(json, Map.class);
		
		Map<String, List<Map>> weather = (Map<String, List<Map>>) map.get("weather");
		List<Map> hourly = (List<Map>) weather.get("hourly");
		Map<String, Object> info = hourly.get(0);
		Map<String, String> grid = (Map<String, String>) info.get("grid");
		
		System.out.println(grid.get("city"));
		System.out.println(grid.get("county"));
		System.out.println(grid.get("village"));
		
		Map<String, String> sky = (Map<String, String>) info.get("sky");
		System.out.println(sky.get("name"));
		
		Map<String, String> temperature = (Map<String, String>) info.get("temperature");
		System.out.println(temperature.get("tc"));
		System.out.println(temperature.get("tmax"));
		System.out.println(temperature.get("tmin"));
		
		System.out.println(info.get("timeRelease"));
		
    }
    
}
