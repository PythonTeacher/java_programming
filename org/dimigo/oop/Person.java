package org.dimigo.oop;

public class Person {
	private String name;
	private String character;
	
	// final 필드
	private final String birthDt;
	private final String bloodType;
	
	// 자바에서의 진정한 상수이다!!!
	public static final String TYPE = "mammals";		// 선언과 동시에 초기화
	
	public Person(String name, String character, String birthDt,
			String bloodType) {
		//this.type = type;
		this.name = name;
		this.character = character;
		this.birthDt = birthDt;			// 생성자를 이용한 초기화
		this.bloodType = bloodType;
	}

	// 객체의 내용을 문자열로 만들어서 리턴해주는 메소드
	public String toString() {
		return "Person [name=" + name + ", character=" + character
				+ ", birthDt=" + birthDt + ", bloodType=" + bloodType
				+ ", type=" + TYPE + "]";
	}
	
	
	
}
