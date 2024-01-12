package org.dimigo.oop;

public class CarTest2 {
	public static void main( String[ ] args) {
		Car2.setCompany("현대");
		
		Car2[] cars = {
				new Car2("제네시스"), new Car2("에쿠스"), new Car2("아슬란")
		};
		
		for(Car2 car : cars) {
			car.printCar();
		}
		
		Car2.setCompany("기아");
		//cars[2].setCompany("기아");
		
		for(Car2 car : cars) {
			car.printCar2();
		}
		
		Car2.setCompany("현대");
		
		for(Car2 car : cars) {
			Car2.printCar3(car);
			Car2.printCar4(car);
		}
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-123));
		System.out.println(Math.addExact(10,  20));
		System.out.println(Math.subtractExact(10, 20));
		
		
		
		
		
		
    }

}
