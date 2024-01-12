package org.dimigo.oop;

public class CalculatorTest {
	
	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		Calculator calc = new Calculator(n1, n2);
		
		//calc.powerOn();
		
		System.out.println(n1 + " + " + n2 + " = " + calc.add());
		System.out.println(n1 + " - " + n2 + " = " + calc.sub());
		System.out.println(n1 + " * " + n2 + " = " + calc.mul());
		System.out.println(n1 + " / " + n2 + " = " + calc.div());
		
		calc.powerOff();

	}

}
