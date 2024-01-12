/**
 * 
 */
package org.dimigo.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * <pre>
 * org.dimigo.network
 *   |_ SocketClient
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2016. 1. 13.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class SocketClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(Socket socket = new Socket("127.0.0.1", 9000)) {
			
			try(BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		    	PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
				out.println("Hello, Server");
				System.out.println("[client]" + in.readLine());
			}
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
