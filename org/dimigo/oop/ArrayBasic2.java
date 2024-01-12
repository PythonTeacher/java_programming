package org.dimigo.oop;

public class ArrayBasic2 {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		int[] intArr1 = new int[] {1, 2, 3, 4, 5};
		
		for(int value : intArr) {
			System.out.print(value + " | ");
		}
		System.out.println();
		
		String[] strArr = {"hello", "world", "java"};
		String[] strArr1 = new String[] {"hello", "world", "java"};
		
		for(String value : strArr) {
			System.out.print(value + " | ");
		}
		System.out.println();
		
		// Book 타입 배열 생성과 동시에 초기화 해보자!!!
		Book[] bookArr = {
				new Book("미생", "윤태호", 1000),
				new Book("자바의신", "나자바", 2000),
				new Book("수학의정석", "홍성대", 3000)
		};
		
		Book[] bookArr1 = new Book[] {
				new Book("미생", "윤태호", 1000),
				new Book("자바의신", "나자바", 2000),
				new Book("수학의정석", "홍성대", 3000)
		};
		
		for(Book value : bookArr) {
			System.out.print(value.getTitle() + " | ");
		}
		System.out.println();
		
		String[] cities = null;
		
		//cities = {"서울", "뉴욕", "파리"};
		
		cities = new String[] {"서울", "뉴욕", "파리"};
		
		int[] test = new int[5];
		
		System.out.println(test[0]);
	}

}
