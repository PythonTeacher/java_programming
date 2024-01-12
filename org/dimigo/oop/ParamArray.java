package org.dimigo.oop;

public class ParamArray {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		ParamArray obj = new ParamArray();
		obj.plus(intArr);
		
		for(int value : intArr) {
			System.out.println(value);
		}
		
		String[] strArr = {"홍길동", "홍길서" ,"홍길남", "홍길북"};
		
		obj.changeFamilyName(strArr);
		
		for(String value : strArr) {
			System.out.println(value);
		}
	}
	
	private void plus(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]++;
			//arr[i] = arr[i] + 1;
		}
	}
	
	private void changeFamilyName(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = "김" + arr[i].substring(1);
		}
	}
	
	
	
	
	
	
	
}
