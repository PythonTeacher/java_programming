/**
 * 
 */
package org.dimigo.thread;

import java.util.Random;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ TaskThread
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 29.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class TaskThread extends Thread {
	
	private String name;
	private int time;
	
	public TaskThread(String name) {
		this.name = name;
		time = new Random().nextInt(10000);		// 0 ~ 9999
	}
	
	@Override
	public void run() {
		System.out.println(name + " start");
		System.out.println(name + "'s sleep time : " + time);
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name + " end");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
