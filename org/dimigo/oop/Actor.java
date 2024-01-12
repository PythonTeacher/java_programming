package org.dimigo.oop;

public class Actor {
	private String name;
	private int age;
	
	public Actor(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void changeOne(Actor actor) {
		actor = new Actor("원빈", 37);
        System.out.println("이름 : " + actor.getName());
    }

	public void changeTwo(Actor actor) {
		actor.setName("원빈");
    }
	
    public static void main(String[] args) {
    	Actor actor = new Actor("현빈", 32);
        
    	actor.changeOne(actor);
        System.out.println("이름 : " + actor.getName());  
        
        actor.changeTwo(actor);
        System.out.println("이름 : " + actor.getName());  
    }

    
}
