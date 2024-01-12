/**
 * 
 */
package org.dimigo.collection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ Board
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 12.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Board {

	private int id;				// 게시판 ID
	private String subject;		// 제목
	private String writer;		// 작성자
	private String content;		// 내용
	private String time;		// 작성일시
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	public Board() {
		
	}
	
	/**
	 * @param subject
	 * @param writer
	 * @param content
	 * @param time
	 */
	public Board(int id, String subject, String writer, String content) {
		super();
		this.id = id;
		this.subject = subject;
		this.writer = writer;
		this.content = content;		
		
		this.time = sdf.format(new Date());
	}
	
	public int getId() {
		return id;
	}
	
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	
	/**
	 * @return the writer
	 */
	public String getWriter() {
		return writer;
	}
	
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", subject=" + subject + ", writer="
				+ writer + ", content=" + content + ", time=" + time + "]";
	}
	
}
