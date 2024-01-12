package org.dimigo.inheritance;

public class Teacher extends Person {
	private String subject;
	
	public Teacher(String name, int age, int height, int weight, String subject) {		
		super(name, age, height, weight);
		this.subject = subject;
	}
	
	public void teach() {
		System.out.println(getName() + "쌤이 공부를 가르친다.");
	}
	
	public void doTask() {
		System.out.println(getName() + "쌤이 업무를 본다.");
	}

	public String toString() {
		return super.toString() + "Teacher [subject=" + subject + "]";
	}
	
	
	
	
	
}




