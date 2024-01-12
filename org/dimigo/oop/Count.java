package org.dimigo.oop;

// Count라는 클래스의 객체가 총 몇개 생성되었는지 알아보자.
// 예) new Count(), new Count(), new Count() -> 3
public class Count {
	private static int count;
	
	public Count() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}
}
