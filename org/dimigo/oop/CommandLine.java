package org.dimigo.oop;

import java.util.Arrays;

public class CommandLine {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램 사용법");
			System.out.println("java CommandLine arg1 arg2");
			System.exit(0);
		}
		
		System.out.println(Arrays.toString(args));
		
		// 문자열을 int 타입으로 변환하기
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
		
		
		
	}

}
