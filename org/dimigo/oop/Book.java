package org.dimigo.oop;

public class Book {
	private String title;
	private String author;
	private int page;		
	
	public Book() { }
	
	/**
	 * @param title
	 * @param author
	 * @param page
	 */
	public Book(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}

	public Book(String title, String author) {
		this(title, author, 0);
	}
	
	public Book(String title) {
		this(title, "저자미상");
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	
	public void setAuthor(String newAuthor) {
		author = newAuthor;
	}
	
	public void setPage(int newPage) {
		if(newPage >= 1) {
			page = newPage;
		}
	}
	
}
