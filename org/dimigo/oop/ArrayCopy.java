package org.dimigo.oop;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] intSrc = {1, 2, 3, 4, 5};
		int[] intDest = new int[10];
		
		System.arraycopy(intSrc, 0, intDest, 3, intSrc.length);
		
		for(int value : intDest) {
			System.out.println(value);
		}
		
		String[] strSrc = {"테란", "저그", "프로토스"};
		String[] strDest = new String[10];
		
		System.arraycopy(strSrc, 0, strDest, 0, strSrc.length);
		
		for(String value : strDest) {
			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
