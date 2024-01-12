/**
 * 
 */
package org.dimigo.gui.vo;

import javafx.beans.property.SimpleStringProperty;

/**
 * <pre>
 * org.dimigo.gui.vo
 *   |_ Movie
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 10.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Movie {

	private SimpleStringProperty title;
	private SimpleStringProperty link;
	private SimpleStringProperty pubDate;
	private SimpleStringProperty director;
	
	public Movie(String title, String link, String pubDate, String director) {
		this.title = new SimpleStringProperty(title);
		this.link = new SimpleStringProperty(link);
		this.pubDate = new SimpleStringProperty(pubDate);
		this.director = new SimpleStringProperty(director);
	}

	public SimpleStringProperty titleProperty() {
		return this.title;
	}

	public java.lang.String getTitle() {
		return this.titleProperty().get();
	}

	public void setTitle(final java.lang.String title) {
		this.titleProperty().set(title);
	}

	public SimpleStringProperty linkProperty() {
		return this.link;
	}

	public java.lang.String getLink() {
		return this.linkProperty().get();
	}

	public void setLink(final java.lang.String link) {
		this.linkProperty().set(link);
	}

	public SimpleStringProperty pubDateProperty() {
		return this.pubDate;
	}

	public java.lang.String getPubDate() {
		return this.pubDateProperty().get();
	}

	public void setPubDate(final java.lang.String pubDate) {
		this.pubDateProperty().set(pubDate);
	}

	public SimpleStringProperty directorProperty() {
		return this.director;
	}

	public java.lang.String getDirector() {
		return this.directorProperty().get();
	}

	public void setDirector(final java.lang.String director) {
		this.directorProperty().set(director);
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", link=" + link + ", pubDate="
				+ pubDate + ", director=" + director + "]";
	}
	
}
