package org.dimigo.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ ServerThread
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 29.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class ServerThread implements Runnable {
  
	// 클라이언트와의 통신을 위한 소켓
	private Socket connectionSocket;
	 
	public ServerThread(Socket connectionSocket) {
		System.out.println(Thread.currentThread().getName() + " thread created");
		this.connectionSocket = connectionSocket;
	}
	  
	@Override
	public void run() {
		// 클라이언트와 통신을 위한 입/출력 2개의 스트림을 생성한다.
	    try(BufferedReader in = new BufferedReader(
	    		new InputStreamReader(connectionSocket.getInputStream()));
	    	PrintWriter out = new PrintWriter(connectionSocket.getOutputStream(), true)) {
	    	
	    	// 클라이언트로의 메시지중 첫번째 줄을 읽어들인다.
	    	String request = in.readLine();
	    	System.out.println("[server]" + request);

	    	String response = "[server]" + request;
	    	out.println(response);
	    	
	    } catch(Exception e) {
	    	e.printStackTrace();	    	
	    } finally {
	    	try {
				connectionSocket.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	System.out.println("Connection Closed");
	    }
	}
}
