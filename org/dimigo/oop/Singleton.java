package org.dimigo.oop;

public class Singleton {
	// 처음부터 아예 객체를 만들고 시작함
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		
	}
	
	// Thread-safe함
	// 필요한 시점에 메소드를 호출해서 객체를 생성하는 방식
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public static Singleton getInstance2() {
		return instance;
	}
	
	
}
