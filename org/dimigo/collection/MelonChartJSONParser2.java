package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MelonChartJSONParser2 {
	
	public static Melon parse(String jsonString){
		Melon melon = null;
		
		try {
			if(jsonString == null || jsonString.length() == 0)
				throw new Exception("No input data");
			
			JSONParser parser = new JSONParser();
			
			JSONObject result = (JSONObject)parser.parse(jsonString);
			JSONObject json = (JSONObject)result.get("melon");
			
			melon = new Melon();

			melon.setMenuId(convertToInt(json.get("menuId")));
			melon.setCount(convertToInt(json.get("count")));
			melon.setPage(convertToInt(json.get("page")));
			melon.setTotalPages(convertToInt(json.get("totalPages")));
			melon.setRankDay((String)json.get("rankDay"));
			melon.setRankHour((String)json.get("rankHour"));			
			
			JSONObject songs = (JSONObject)json.get("songs");			
			JSONArray songArr = (JSONArray)songs.get("song");
			
			int songCnt = songArr.size();
			
			JSONObject tempSong = null;
			JSONObject artists;
			JSONArray artistArr = null;
			JSONObject tempArtist = null;
			
			Song song = null;
			List<Song> songList = new ArrayList<Song>(songCnt);
			List<Artist> artistList;
			Artist artist = null;
			
			for(int i = 0; i < songCnt ; i++) {
				tempSong = (JSONObject)songArr.get(i);
				song = new Song();				

				song.setSongId(convertToInt(tempSong.get("songId")));
				song.setSongName((String)tempSong.get("songName"));
				
				artists = (JSONObject)tempSong.get("artists");				
				artistArr = (JSONArray)artists.get("artist");
				
				int artistCnt = artistArr.size();
				artistList = new ArrayList<Artist>(artistCnt);
				
				for(int j = 0; j < artistCnt ; j++) {
					tempArtist = (JSONObject)artistArr.get(j);
					artist = new Artist();
					artist.setArtistId(convertToInt(tempArtist.get("artistId")));
					artist.setArtistName((String)tempArtist.get("artistName"));
					artistList.add(artist);
				}
				song.setArtists(artistList);
				
				song.setAlbumId(convertToInt(tempSong.get("albumId")));
				song.setAlbumName((String)tempSong.get("albumName"));
				song.setCurrentRank(convertToInt(tempSong.get("currentRank")));
				song.setPastRank(convertToInt(tempSong.get("pastRank")));
				song.setPlayTime(convertToInt(tempSong.get("playTime")));
				song.setIssueDate((String)tempSong.get("issueDate"));
				song.setTitleSong(convertToBoolean(tempSong.get("isTitleSong")));
				song.setHitSong(convertToBoolean(tempSong.get("isHitSong")));				
				song.setAdult(convertToBoolean(tempSong.get("isAdult")));
				song.setFree(convertToBoolean(tempSong.get("isFree")));
				
				songList.add(song);
			}
			
			melon.setSongs(songList);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return melon;
	}
	
	private static int convertToInt(Object target) {
		return Integer.parseInt(target.toString());
//		return ((Long)target).intValue();
	}
	
	private static boolean convertToBoolean(Object target) {
		return Boolean.parseBoolean(target.toString());
	}
}
