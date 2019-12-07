package javaStudy;

public class Earth {
	public static void main(String args[]) {
		
		Human human1 = new Human("Darshani", 34, 68, "Black");
		Human human2 = new Human("Chandana", 35, 73, "Blue");
		Human human3 = new Human("Chandima", 24, 67, "Brown");
		
		human1.speak();
		human2.speak();
		human3.speak();
	}

}
