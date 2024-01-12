package org.dimigo.oop;

public class Calculator2 {
	/************* 인스턴스 필드 ***************/
	private boolean powerFlag;
	
	/************* 정적 필드 (static) ************/
	public static double PI = 3.141592;
	
	public Calculator2() {
		
	}
	
	/************* 인스턴스 메소드 ***************/
	public void powerOn() {
		if(!this.powerFlag) {
			System.out.println("전원을 켭니다.");
			this.powerFlag = true;
		}
	}
	
	public void powerOff() {
		if(this.powerFlag) {
			System.out.println("전원을 끕니다.");
			this.powerFlag = false;			
		}
	}
	
	/************* 정적 메소드 ***************/
	public static int add(int num1, int num2) {
		return num1 + num2;		
	}
		
	public static int sub(int num1, int num2) {
		//this.powerOn();
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		//this.powerOn();
		return num1 * num2;
	}
	
	public static double div(int num1, int num2) {
		//this.powerOn();
		return (double)num1 / num2;
	}
	
	// 메소드 오버로딩
	public static int add(int num1, int num2, Calculator2 c) {
		c.powerOn();
		return num1 + num2;		
	}
		
	public static int sub(int num1, int num2, Calculator2 c) {
		c.powerOn();
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2, Calculator2 c) {
		c.powerOn();
		return num1 * num2;
	}
	
	public static double div(int num1, int num2, Calculator2 c) {
		c.powerOn();
		return (double)num1 / num2;
	}
	
	// 메소드 오버로딩
	public static double add(double num1, double num2, Calculator2 c) {
		c.powerOn();
		return num1 + num2;		
	}
		
	public static double sub(double num1, double num2, Calculator2 c) {
		c.powerOn();
		return num1 - num2;
	}
	
	public static double mul(double num1, double num2, Calculator2 c) {
		c.powerOn();
		return num1 * num2;
	}
	
	public static double div(double num1, double num2, Calculator2 c) {
		c.powerOn();
		return (double)num1 / num2;
	}
}
