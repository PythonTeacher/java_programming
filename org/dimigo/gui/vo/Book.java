/**
 * 
 */
package org.dimigo.gui.vo;

import javafx.beans.property.SimpleStringProperty;

/**
 * <pre>
 * org.dimigo.gui.vo
 *   |_ Book
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 10.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Book {

	private SimpleStringProperty title;
	private SimpleStringProperty link;
	private SimpleStringProperty author;
	private SimpleStringProperty price;
	
	public Book(String title, String link, String author, String price) {
		this.title = new SimpleStringProperty(title);
		this.link = new SimpleStringProperty(link);
		this.author = new SimpleStringProperty(author);
		this.price = new SimpleStringProperty(price);
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

	public SimpleStringProperty authorProperty() {
		return this.author;
	}

	public java.lang.String getAuthor() {
		return this.authorProperty().get();
	}

	public void setAuthor(final java.lang.String author) {
		this.authorProperty().set(author);
	}

	public SimpleStringProperty priceProperty() {
		return this.price;
	}

	public java.lang.String getPrice() {
		return this.priceProperty().get();
	}

	public void setPrice(final java.lang.String price) {
		this.priceProperty().set(price);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", link=" + link + ", author=" + author
				+ ", price=" + price + "]";
	}	
	
}
