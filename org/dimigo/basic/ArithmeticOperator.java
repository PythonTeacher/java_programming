package org.dimigo.basic;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int a = 5, b = 2;
		
		System.out.println(a + b);		
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		// a/b의 값이 2.5가 나오게 하려면?
		double result = (double)a / b;
		System.out.println(result);
		
		// 0으로 나누면?
//		result = a / 0;
		
		// 다른 타입간의 연산
		// -> 연산의 결과는 제일 큰 타입으로 된다. 
		double d = 3.14;
		int i = 10;
//		int r = d + i;
		int r = (int) (d + i);
		double r1 = d + i;
		
		System.out.println(r);
		System.out.println(r1);
		
		// int보다 작은 타입간의 연산
		// -> 연산의 결과는 int 타입이 된다.
		short s1 = 1, s2 = 2;
//		short r2 = s1 + s2;           // error
		short r2 = (short)(s1 + s2);  
		int r3 = s1 + s2;

		System.out.println(r2);
		System.out.println(r3);
		
	}

}
