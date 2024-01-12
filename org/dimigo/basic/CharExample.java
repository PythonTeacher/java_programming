package org.dimigo.basic;

public class CharExample {

	public static void main(String[] args) {
		char ch1 = 'A';			
		char ch2 = 65;			// 65(10진수) 
		char ch3 = '\u0041';	// 0041(16진수)
				
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		char ch4 = '가';
		//가에 대한 유니코드는?
		int unicode = ch4;		
		
		System.out.println(ch4);
		System.out.println(unicode);
		
		char ch5 = 44032;		// 10진수
		System.out.println(Integer.toHexString(44032));
		
		char ch6 = '\uAC00';	// 16진수
		
		System.out.println(ch5);
		System.out.println(ch6);

		// 문자열
		String name = "홍길동";
		System.out.println("My name is " + name);
		
		System.out.print("abc");
		System.out.print("def\n");
		System.out.printf("%d, %.2f, %s, %c\n", 100, 3.14, "홍길동", 'A');
		
		byte[] bytes = {49,0,0};
		
		System.out.println((char)bytes[0]);
		
	}

}