package org.dimigo.oop;

public class CallByValue {

	private void methodA(int num) {
		num += 10;
		System.out.println("methodA : " + num);
	}
	
	private void methodB(Book book) {
		System.out.println(book.getTitle());
		book = new Book("침묵의봄", "저자미상", 2000);
		System.out.println(book.getTitle());
	}
	
	private void methodC(Book book) {
		book.setTitle("워드마스터");
	}
	
	public static void main(String[] args) {
		int num = 10;
		
		CallByValue ref = new CallByValue();
		ref.methodA(num);
		
		System.out.println("main : " + num);
		
		Book book = new Book("자바의정석", "남궁성", 1000);
		ref.methodB(book);
		System.out.println(book.getTitle());
		
		ref.methodC(book);
		System.out.println(book.getTitle());
	}

}
