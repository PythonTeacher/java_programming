package org.dimigo.inheritance;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person("아이유", 23, 162, 44);
				
		p.eat();
		p.sleep();
		
		Student s = new Student("홍길동", 18, 180, 55, "2301");
		
		s.eat();
		s.sleep();
		s.study();
		s.eatSnack();
		
		System.out.println();
		
		Teacher t = new Teacher("나자바", 32, 175, 78, "자바");
		
		t.eat();
		t.teach();
		t.doTask();
		t.sleep();
		
		System.out.println(p);
		System.out.println(s);
		System.out.println(t);
		
		// 메소드 오버라이딩 실습
		Korean k = new Korean("송대한");
		Japanese j = new Japanese("다나카");
		Chinese c = new Chinese("왕밍");
		
		System.out.println(k);
		System.out.println(j);
		System.out.println(c);
		
		k.sayHello();
		j.sayHello();
		c.sayHello();
		
		k.sayBye();
		j.sayBye();
		c.sayBye();
		
		System.out.println("----------------");
		
		// 배열의 다형성을 이용하여 출력하기
		Person[] people = {
				new Korean("송대한"), new Japanese("나까무라"), new Chinese("왕밍")
		};
		
		for(Person person : people) {
			person.sayHello();
			person.sayBye();
			
			greeting(person);	// 매개변수를 이용한 다형성
		}
		
	}
	
	private static void greeting(Person p) {
		p.sayHello();
		p.sayBye();
	}
	
	
	
	
	
	
	

}
