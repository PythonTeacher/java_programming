/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *   |_ HttpURLTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 26.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class HttpURLTest {

	private static final String USER_AGENT = "Mozilla/5.0";
	
	public static void main(String[] args) {
		HttpURLTest t = new HttpURLTest();
		
		t.sendGet();
		
		t.sendPost();
	}
	
	private void sendGet() {
		BufferedReader in = null;
		String url = "https://httpbin.org/get";
		
		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	
			// optional default is GET
			con.setRequestMethod("GET");
	
			// add request header
			con.setRequestProperty("User-Agent", USER_AGENT);
	
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);
	
			in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String line;
			StringBuffer response = new StringBuffer();
	
			while ((line = in.readLine()) != null) {
				response.append(line);
			}
				
			//print result
			System.out.println(response.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null)
					in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void sendPost() {
		BufferedReader in = null;
		String url = "https://httpbin.org/post"; //http://posttestserver.com/post.php";
		
		try {
			URL obj = new URL(url);
//			HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			//add reuqest header
			con.setRequestMethod("POST");
			con.setRequestProperty("User-Agent", USER_AGENT);
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

			String urlParameters = "key1=value1&key2=value2&key3=value3";
			
			// Send post request
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'POST' request to URL : " + url);
			System.out.println("Post parameters : " + urlParameters);
			System.out.println("Response Code : " + responseCode);

			in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			
			//print result
			System.out.println(response.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null)
					in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
