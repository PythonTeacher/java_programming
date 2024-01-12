package org.dimigo.basic;

public class IfElse {

	public static void main(String[] args) {
		// 0~6 : 영유아기
		// 7~12 : 아동기
		// 13~15 : 사춘기
		// 16~24 : 청년기
		int age = 18;
		
		if(age >= 0 && age <= 6) {
			System.out.println("영유아기입니다.");
		} else if(age <= 12) {
			System.out.println("아동기입니다.");
		} else if(age <= 15) {
			System.out.println("사춘기입니다.");
		} else if(age <= 24) {
			System.out.println("청년기입니다.");
		} else {
			System.out.println("성인입니다.");
		}
		
		// if~else문에서 주의할 사항
		int i = 5;
		
		if(i > 10) {
			if(i < 100)
				System.out.println("10보다 크고 100보다 작다.");
		} else {
			System.out.println("10보다 작거나 같다.");
		}
		
		
		
		
		
		
		
		
		
	}

}
