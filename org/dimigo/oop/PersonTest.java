package org.dimigo.oop;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("심민규", "착함", "19980420", "A형");
		Person p2 = new Person("박민준", "못됨", "19980417", "A형");
		
		System.out.println(p1.toString());
		System.out.println(p2);
		
		//p1.type = "양서류";
		System.out.println(Person.TYPE);
		//Person.TYPE = "파충류";
	}
}
