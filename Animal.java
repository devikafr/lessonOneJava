package javaStudy;

public class Animal {
	String name;
	int age;
	String gender;
		
	
	public Animal(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void speaking() {
		System.out.println("I am a " + name);
		System.out.println("I am " + age + " old ");
		System.out.println("I am a " + gender);
	}
	
	public void eating() {
		System.out.println("eating");
	}
	
	public void sleep() {
		System.out.println("sleeping");
	}

}
