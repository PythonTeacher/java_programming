/**
 * 
 */
package org.dimigo.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javafx.collections.ObservableList;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ MelonController
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 3.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class MelonController implements Initializable {

	@FXML ListView<String> listView;
	@FXML TableView<Melon> tableView;
	
	private String selectedGenreId;
	private Map<String, String> genreMap;
	
	private static final String APP_KEY = "4ce8bb31-9934-376b-8a64-0b5922ad9f71";
	
	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		setGenreMap();
		
		listView.setItems(
				FXCollections.observableArrayList(new ArrayList<String>(genreMap.keySet())));
		
		listView.getSelectionModel().selectedItemProperty().addListener(
				new ChangeListener<String>() {
					@Override
					public void changed(ObservableValue<? extends String> arg0,
							String arg1, String arg2) {
						selectedGenreId = genreMap.get(arg2);
						System.out.println(selectedGenreId);
							
						String response = getResponse("http://apis.skplanetx.com/melon/charts/topgenres/" + selectedGenreId,
														  "?count=10&page=1&version=1");
						
						List<Melon> musicList = getMusicList(response);
						System.out.println(musicList);
						
						ObservableList<Melon> data = 
								FXCollections.observableArrayList(musicList);
						
						tableView.setItems(data);
					}
				}
		);
		
		TableColumn songName = tableView.getColumns().get(0);
		songName.setCellValueFactory(
                new PropertyValueFactory<Melon, String>("songName"));
		
		TableColumn artistName = tableView.getColumns().get(1);
		artistName.setCellValueFactory(
                new PropertyValueFactory<Melon, String>("artistName"));
		
		
		tableView.setOnMouseClicked(new EventHandler<Event>() {
			@Override
			public void handle(Event arg0) {
				Melon song = tableView.getSelectionModel().getSelectedItem();
				System.out.println(song);
			}
		});
	}

	private String getResponse(String url, String query) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		String responseBody = null;
		
	    try {
	    	HttpGet httpget = new HttpGet(url + query);
	        httpget.setHeader("appKey", APP_KEY);
	        
	        System.out.println("Executing request " + httpget.getRequestLine());

	        // Create a custom response handler
	        ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

	            @Override
	            public String handleResponse(
	                    final HttpResponse response) throws ClientProtocolException, IOException {
	                int status = response.getStatusLine().getStatusCode();
	                if (status >= 200 && status < 300) {
	                    HttpEntity entity = response.getEntity();
	                    return entity != null ? EntityUtils.toString(entity) : null;
	                } else {
	                    throw new ClientProtocolException("Unexpected response status: " + status);
	                }
	            }

	        };
	        responseBody = httpclient.execute(httpget, responseHandler);
	        System.out.println("----------------------------------------");
	        System.out.println(responseBody);	       

	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    return responseBody;
	}
	
	private void setGenreMap() {
		genreMap = new LinkedHashMap<>();
		genreMap.put("종합", "DP0000");
		genreMap.put("가요", "DP0100");
		genreMap.put("POP", "DP0200");
		genreMap.put("OST", "DP0300");
		genreMap.put("J-POP", "DP0400");
		genreMap.put("클래식", "DP0500");
		genreMap.put("CCM", "DP0600");
		genreMap.put("어린이", "DP0700");
	}
	
	private List<Melon> getMusicList(String response) {
		List<Melon> list = new ArrayList<Melon>();
		
		try {
			JSONParser parser = new JSONParser();
			
			JSONObject result = (JSONObject)parser.parse(response);
			JSONObject json = (JSONObject)result.get("melon");
			
			JSONObject songs = (JSONObject)json.get("songs");			
			JSONArray songArr = (JSONArray)songs.get("song");
			
			int size = songArr.size();
			
			for(int i = 0; i < size ; i++) {
				JSONObject tempSong = (JSONObject)songArr.get(i);
				
				String songName = (String)tempSong.get("songName");
				
				JSONObject artists = (JSONObject)tempSong.get("artists");				
				JSONArray artistArr = (JSONArray)artists.get("artist");
				
				int artistCnt = artistArr.size();
				
				String artistName = "";
				for(int j = 0; j < artistCnt; j++) {
					JSONObject tempArtist = (JSONObject)artistArr.get(j);
					artistName += (String)tempArtist.get("artistName") + " ";
				}
				
				list.add(new Melon(songName, artistName));
			}		
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
