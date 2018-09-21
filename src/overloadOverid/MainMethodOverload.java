package overloadOverid;

public class MainMethodOverload {

	
	public static void main(String[] args) {
		System.out.println("Main method--1");
		main("Hello");
		main(4);
		main(1, 2);
	}
	
	public static void main(String args) {
		System.out.println("Main method--2");
	}
	public static void main(int args) {
		System.out.println("Main method--3");
	}
	public static void main(int args, int b) {
		System.out.println("Main method--4");
	}
}
