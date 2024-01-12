package org.dimigo.oop;

public class Car2 {
	// 인스턴스 필드
	private String name;
	
	// 정적 필드
	private static String company;
	
	public Car2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Car2.company = company;
	}
	
	// 1. 인스턴스 메소드에서 인스턴스 필드와 static 필드 호출하기
	public void printCar() {
		System.out.println(this.name + ", " + company);
	}
	
	// 2. 인스턴스 메소드에서 인스턴스 메소드와 static 메소드 호출하기
	public void printCar2() {
		System.out.println(this.getName() + ", " + getCompany());
	}
	
	// 3. static 메소드에서 인스턴스 필드와 static 필드 호출하기
	public static void printCar3(Car2 car) {
		System.out.println(car.name + ", " + company);
	}
	
	// 4. static 메소드에서 인스턴스 메소드와 static 메소드 호출하기
	public static void printCar4(Car2 car) {
		//System.out.println(getName() + ", " + getCompany());
		System.out.println(car.getName() + ", " + getCompany());
	}
	
	
	
	
	
	
	
	
	
}
