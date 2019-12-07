package javaStudy;

public class Zoo {
	public static void main(String Args[]) {
		
		Animal animal1 = new Animal("Bear", 4, "Male");
		Animal animal2 = new Animal("Tiger", 6, "Male");
		Animal animal3 = new Animal("Giraff", 2, "Female");
		
		animal1.speaking();
		animal2.speaking();
		animal3.speaking();
	}

}
