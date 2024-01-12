package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MelonChartJSONParser {
	
	public static Melon parse(String jsonString) {
		Melon melon = null;
		
		try {
			if(jsonString == null || jsonString.length() == 0)
				throw new Exception("No input data");
			
			JSONParser parser = new JSONParser();
			
			JSONObject result = (JSONObject)parser.parse(jsonString);
			JSONObject json = (JSONObject)result.get("melon");
			
			melon = new Melon();
			
			JSONObject songs = (JSONObject)json.get("songs");			
			JSONArray songArr = (JSONArray)songs.get("song");
			
			int songCnt = songArr.size();
			
			List<Song> songList = new ArrayList<Song>(songCnt);

			for(int i = 0; i < songCnt ; i++) {
				JSONObject tempSong = (JSONObject)songArr.get(i);
				Song song = new Song();				

				song.setSongName((String)tempSong.get("songName"));
				
				JSONObject artists = (JSONObject)tempSong.get("artists");				
				JSONArray artistArr = (JSONArray)artists.get("artist");
				
				int artistCnt = artistArr.size();
				List<Artist> artistList = new ArrayList<Artist>(artistCnt);
				
				for(int j = 0; j < artistCnt; j++) {
					JSONObject tempArtist = (JSONObject)artistArr.get(j);
					Artist artist = new Artist();
					
					artist.setArtistName((String)tempArtist.get("artistName"));
					artistList.add(artist);
				}
				song.setArtists(artistList);
				
				songList.add(song);
			}
			
			melon.setSongs(songList);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return melon;
	}

}
