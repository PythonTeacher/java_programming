/**
 * 
 */
package org.dimigo.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <pre>
 * org.dimigo.network
 *   |_ SocketServer
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2016. 1. 13.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class SocketServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		try(ServerSocket listener = new ServerSocket(9000)) {	
			System.out.println("Server starting up on port 9000");
	        System.out.println("(press ctrl-c to exit)");
	        
	        Socket socket;
	        Thread thread;
	        
			while((socket = listener.accept()) != null) {
				thread = new Thread(new ServerThread(socket));
				thread.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
