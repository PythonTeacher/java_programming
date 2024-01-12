package org.dimigo.oop;

public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public boolean forward(int speed) {
		System.out.println(speed + "만큼 전진");
		return true;
	}
	
	public boolean backward(int speed) {
		System.out.println(speed + "만큼 후진");
		return true;
	}
	
	public boolean stop() {
		System.out.println("멈춥니다");
		return true;
	}
	
	public boolean turnLeft(int angle) {
		System.out.println(angle + "만큼 좌회전");
		return true;
	}
	
	public boolean turnRight(int angle) {
		System.out.println(angle + "만큼 우회전");
		return true;
	}	
	
	
	
}
