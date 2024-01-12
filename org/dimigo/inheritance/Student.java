package org.dimigo.inheritance;

public class Student extends Person {
	
	private String studentId;

	public Student(String name, int age, int height, int weight, String studentId) {		
		super(name, age, height, weight);
		this.studentId = studentId;
	}

	public void study() {
		System.out.println(super.getName() + "이/가 공부를 합니다.");
	}
	
	public void eatSnack() {
		System.out.println(getName() + "이/가 간식을 먹습니다.");
	}

	public String toString() {
		return super.toString() + "Student [studentId=" + studentId + "]";

//		StringBuilder sb = new StringBuilder();
//		sb.append(name).append(age).append(height).append(weight);
//		
//		return sb.toString();
		
	}
	
	
}
