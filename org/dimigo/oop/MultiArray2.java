package org.dimigo.oop;

public class MultiArray2 {

	public static void main(String[] args) {
		// 이차원배열 생성 시 초기화하기
		// 1. 중괄호만 두번 사용
		int[][] intArr = {
				{ 1, 2, 3 },
				{ 4, 5, 6 }
		};
		
		for(int[] arr : intArr) {
			for(int value  : arr) {
				System.out.print(value + " | ");
			}
			System.out.println();
		}	
		
		// 2. 중괄호 + new 연산자 이용
		int[][] intArr2 = {
				new int[] { 1, 2, 3, 4 },
				new int[] { 5, 6 }
		};
		
		// 3. new 연산자 + 중괄호 이용
		int[][] intArr3 = new int[][] {
				{ 1, 2, 3, 4 },
				{ 5, 6 }
		};
		
		// 4. new 연산자 + new 연산자 이용
		int[][] intArr4 = new int[][] {
				new int[] { 7, 8, 9 },
				new int[] { 10, 11 }
		};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
