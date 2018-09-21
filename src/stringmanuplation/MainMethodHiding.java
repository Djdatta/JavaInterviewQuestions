package stringmanuplation;

public class MainMethodHiding {

	public static void main(String[] args) {
		System.out.println("parent");
	}
}

class child extends MainExtend{
	
	public static void main(String[] args) {
		System.out.println("child");
	}
	
}
//this concept is method hiding not overriding