/**
 * 
 */
package org.dimigo.collection;

import java.util.LinkedList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ BoardManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 12.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class BoardManager {

	private List<Board> boardList;
	
	public BoardManager(List<Board> list) {
		// Vector, LinkedList로 변경
		boardList = list;
	}
	
	// Create : 등록
	public void insertBoard(String subject, String writer, String content) {
		int id = boardList.size() + 1;
		boardList.add(new Board(id, subject, writer, content));
	}
	
	// Read : 조회
	public Board searchBoard(int id) {
		return boardList.get(id - 1);
	}
	
	// Update : 수정
	public void updateBoard(int id, String subject, String writer, String content) {
		boardList.set(id - 1, new Board(id, subject, writer, content));
	}
	
	// Delete : 삭제
	public void deleteBoard(int id) {
		boardList.remove(id - 1);
	}
	
	// 리스트 조회
	public void selectAllBoard() {
		for(Board board : boardList) {
			System.out.println(board);
		}
	}
}
