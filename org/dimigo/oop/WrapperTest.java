package org.dimigo.oop;

public class WrapperTest {

	public static void main(String[] args) {
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
		
		// Boxing - 1. 생성자 이용하기
		Integer num1 = new Integer(1000);
		Integer num2 = new Integer(1000);
		
		if(num1 == num2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		if(num1.equals(num2)) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
		
		// Boxing - 2. valueOf() 메소드 이용하기
		Integer obj1 = Integer.valueOf(1000);
		Double obj2 = Double.valueOf(3.14);
		
		// Unboxing - xxxValue() 메소드 이용하기
		int i1 = obj1.intValue();
		double d1 = obj2.doubleValue();
		
		// 문자열을 Primitive Data Type으로 바꾸기 - parseXxx()
		int i2 = Integer.parseInt("10000");
		double d2 = Double.parseDouble("12.345");
		
		Integer n1 = new Integer(1000);
		Integer n2 = new Integer(2000);
		
		// 총 몇 번의 Autoboxing과 AutoUnboxing이 일어나고 있나?
		Integer result = n1 + n2;
		System.out.println(result);
		
	}

}
