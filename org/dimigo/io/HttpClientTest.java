/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

/**
 * <pre>
 * org.dimigo.io
 *   |_ HttpClientTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 26.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class HttpClientTest {

	private static final String USER_AGENT = "Mozilla/5.0";
	
	public static void main(String[] args) {
		HttpClientTest t = new HttpClientTest();
		
		t.sendGet();
		
		t.sendPost();

	}
	
	private void sendGet() {
		String url = "https://httpbin.org/get";
		BufferedReader rd = null;
		
		try(CloseableHttpClient httpclient = HttpClients.createDefault()) {
			
			HttpGet request = new HttpGet(url);
	
			// add request header
			request.addHeader("User-Agent", USER_AGENT);
	
			HttpResponse response = httpclient.execute(request);
	
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + 
	                       response.getStatusLine().getStatusCode());
	
			rd = new BufferedReader(
	                       new InputStreamReader(response.getEntity().getContent()));
	
			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
	
			System.out.println(result.toString());
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rd != null)
				try {
					rd.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	private void sendPost() {
		String url = "https://httpbin.org/post";

		try(CloseableHttpClient httpclient = HttpClients.createDefault()) {
			HttpPost post = new HttpPost(url);
	
			// add header
			post.setHeader("User-Agent", USER_AGENT);
	
			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			urlParameters.add(new BasicNameValuePair("key1", "value1"));
			urlParameters.add(new BasicNameValuePair("key2", "value2"));
			urlParameters.add(new BasicNameValuePair("key3", "value3"));
	
			post.setEntity(new UrlEncodedFormEntity(urlParameters));
	
			HttpResponse response = httpclient.execute(post);
			System.out.println("\nSending 'POST' request to URL : " + url);
			System.out.println("Post parameters : " + post.getEntity());
			System.out.println("Response Code : " + 
	                                    response.getStatusLine().getStatusCode());
	
			BufferedReader rd = new BufferedReader(
	                        new InputStreamReader(response.getEntity().getContent()));
	
			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
	
			System.out.println(result.toString());	
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
