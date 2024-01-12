package org.dimigo.oop;

public class ArrayBasic {
	
	public static void main(String[] args) {
		// 배열 선언
		int[] intArr = null;
		
		// 배열 생성
		intArr = new int[5];
		
		intArr[3] = 10;
		
		for(int value : intArr) {
			System.out.print(value + " | ");
		}
		System.out.println();
				
		// 배열 선언과 생성을 동시에 하기
		String[] strArr = new String[3];
		
		strArr[0] = "EXO";
		strArr[1] = "EXID";
		
		for(String value : strArr) {
			System.out.print(value + " | ");
		}
		
		System.out.println();
		
		// 길이가 3인 Book 타입 배열을 생성해 보자!
		Book[] bookArr = new Book[3];
		
		bookArr[0] = new Book("미생", "윤태호", 1000);
		bookArr[1] = new Book("자바의신", "나자바", 2000);
		bookArr[2] = new Book("수학의정석", "홍성대", 3000);
		
		for(Book value : bookArr) {
			System.out.print(value.getTitle() + " | ");
		}
		System.out.println();
		
		
		
		
		
	}

}