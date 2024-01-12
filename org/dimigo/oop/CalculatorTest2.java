package org.dimigo.oop;

public class CalculatorTest2 {
	
	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		
		Calculator2 calc = new Calculator2();
		
		// 인스턴스 메소드 호출
		calc.powerOn();
		
		// 정적 메소드 호출
		System.out.println(Calculator2.PI);
		System.out.println(n1 + " + " + n2 + " = " + Calculator2.add(n1,  n2));
		System.out.println(n1 + " - " + n2 + " = " + Calculator2.sub(n1,  n2));
		System.out.println(n1 + " * " + n2 + " = " + Calculator2.mul(n1,  n2));
		System.out.println(n1 + " / " + n2 + " = " + Calculator2.div(n1,  n2));
		
		// static 메소드 호출 시 인스턴스 메소드 호출 방식으로 해도 실행은 되지만
		// 권장하는 방법은 아님 -> 클래스명.메소드명()
		System.out.println(calc.add(10, 20));
		
		calc.powerOff();		
		
		// power를 켜지 않고 바로 연산을 했을 때 power가 자동으로 켜지도록 해보자
		System.out.println(n1 + " + " + n2 + " = " + Calculator2.add(n1,  n2, calc));
		System.out.println(n1 + " - " + n2 + " = " + Calculator2.sub(n1,  n2, calc));
		System.out.println(n1 + " * " + n2 + " = " + Calculator2.mul(n1,  n2, calc));
		System.out.println(n1 + " / " + n2 + " = " + Calculator2.div(n1,  n2, calc));
		
		calc.powerOff();
		
		double d1 = 1.2, d2 = 3.4;
		
		System.out.println(d1 + " + " + d2 + " = " + Calculator2.add(d1,  d2, calc));
		System.out.println(d1 + " - " + d2 + " = " + Calculator2.sub(d1,  d2, calc));
		System.out.println(d1 + " * " + d2 + " = " + Calculator2.mul(d1,  d2, calc));
		System.out.println(d1 + " / " + d2 + " = " + String.format("%.1f", Calculator2.div(d1,  d2, calc)));
		
		
	}

}
