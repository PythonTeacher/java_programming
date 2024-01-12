package org.dimigo.basic;

public class StringConcat {

	public static void main(String[] args) {
		String school = "디미고";
		int grade = 2;
		int ban = 6;
		String name = "김자바";
		
		System.out.println(school + grade + ban + name);
		System.out.println(grade + ban + school + name);
		
		// 26디미고김자바를 출력하려면?
		System.out.println("" + grade + ban + school + name);
		System.out.println(grade + (ban + school) + name);
	}

}
