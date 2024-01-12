package org.dimigo.oop;

public class MultiArray {

	public static void main(String[] args) {
		// 이차원 배열 생성하기
		int[][] intArr = new int[2][3];
		
		// 이차원 배열의 요소값 출력하기
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				System.out.print(intArr[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println();
		
		intArr[0][0] = 100;
		intArr[1][2] = 90;
		//intArr[1][3] = 80;
				
		for(int[] arr : intArr) {
			for(int value  : arr) {
				System.out.print(value + " | ");
			}
			System.out.println();
		}		
		
		// 먼저 일차원 배열을 생성하고, 다시 일차원 배열을 생성해서 연결하기
		String[][] strArr = new String[2][];
		strArr[0] = new String[3];
		strArr[1] = new String[2];
		
		strArr[0][0] = "C";
		strArr[0][1] = "Java";
		strArr[0][2] = "C++";
		//strArr[0][3] = "C#";
		
		strArr[1][0] = "PHP";
		strArr[1][1] = "JSP";
		
		for(String[] arr : strArr) {
			for(String value  : arr) {
				System.out.print(value + " | ");
			}
			System.out.println();
		}
		
		
		
		
		
	}	

}
