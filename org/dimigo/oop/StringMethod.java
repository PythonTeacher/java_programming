package org.dimigo.oop;

public class StringMethod {

	public static void main(String[] args) {
		//          01234567890123
		String s = "abcdefgABCDEFG";
		
		System.out.println(s.length()); 	 	// 14
		System.out.println(s.substring(3));  	// defgABCDEFG
		System.out.println(s.substring(3, 6));  // def
		System.out.println(s.indexOf("C"));  	// 9
		System.out.println(s.charAt(7));  	    // A
		System.out.println(s.concat("ABC"));    // abcdefgABCDEFGABC
		System.out.println("    ABC    ".trim()); // ABC
		System.out.println(s.toUpperCase());     // ABCDEFGABCDEFG
		System.out.println(s.toLowerCase());     // abcdefgabcdefg
		System.out.println(s.replace('a', 'A'));  // AbcdefgABCDEFG
		System.out.println(s.startsWith("abc"));  // true
		System.out.println(s.endsWith("FG"));     // true
	} 

}