package org.dimigo.gui;

import javafx.beans.property.SimpleStringProperty;

public class Melon {

	private SimpleStringProperty songName;
	private SimpleStringProperty artistName;
	
	/**
	 * @param songName
	 * @param artistName
	 * @param albumName
	 * @param currentRank
	 * @param pastRank
	 */
	public Melon(String songName, String artistName) {
		super();
		this.songName = new SimpleStringProperty(songName);
		this.artistName = new SimpleStringProperty(artistName);
	}
	/**
	 * @return the songName
	 */
	public String getSongName() {
		return songName.get();
	}
	/**
	 * @param songName the songName to set
	 */
	public void setSongName(String songName) {
		this.songName.set(songName);
	}
	/**
	 * @return the artistName
	 */
	public String getArtistName() {
		return artistName.get();
	}
	/**
	 * @param artistName the artistName to set
	 */
	public void setArtistName(String artistName) {
		this.artistName.set(artistName);
	}

	@Override
	public String toString() {
		return "Melon [songName=" + songName + ", artistName=" + artistName
				+ "]";
	}	
	
	
}
