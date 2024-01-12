/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ BoardTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 12.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class BoardTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		BoardManager manager = new BoardManager(new ArrayList<Board>());

		manager.insertBoard("제목1", "작성자1", "내용1");
		manager.insertBoard("제목2", "작성자2", "내용2");
		manager.insertBoard("제목3", "작성자3", "내용3");
		manager.insertBoard("제목4", "작성자4", "내용4");
		manager.insertBoard("제목5", "작성자5", "내용5");
		
		manager.selectAllBoard();
		System.out.println();
		
		Board board = manager.searchBoard(3);
		System.out.println(board);
		
		Thread.sleep(1000 * 2);
		
		manager.updateBoard(4, "제목수정", "작성자수정", "내용수정");
		
		System.out.println();
		manager.selectAllBoard();
		
		manager.deleteBoard(2);
		
		System.out.println();
		manager.selectAllBoard();
	}

}
