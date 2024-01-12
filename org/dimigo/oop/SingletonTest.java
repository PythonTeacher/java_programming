/**
 * 
 */
package org.dimigo.oop;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);
		
		s1 = Singleton.getInstance2();
		s2 = Singleton.getInstance2();
		
		System.out.println(s1 == s2);
	}

}
