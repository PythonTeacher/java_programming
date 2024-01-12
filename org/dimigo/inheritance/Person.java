package org.dimigo.inheritance;

/**
 * 
 * <pre>
 * org.dimigo.inheritance
 *   |_ Person
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 7. 13.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Person {
	/**
	 * 필드 목록
	 */
	public String name;	
	protected int age;
	int height;			// default 접근 제어자
	private int weight;
		
	/**
	 * 기본 생성자
	 */
	public Person() {
	
	}

	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * 매개변수 4개짜리 생성자
	 * @param name 이름
	 * @param age 나이
	 * @param height 키
	 * @param weight 몸무게
	 */
	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	/** 
	 * getter 메소드
	 * @return 이름
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 밥 먹는 메소드
	 */
	public void eat() {
		System.out.println(name + "이/가 밥을 먹는다.");
	}

	/**
	 * 잠 자는 메소드
	 */
	public void sleep() {
		System.out.println(name + "이/가 잠을 잔다.");
	}
	
	// 메소드 오버라이딩 실습을 위한 메소드 추가
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public void sayBye() {
		System.out.println("Bye");
	}
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height
				+ ", weight=" + weight + "]";
	}
	
}