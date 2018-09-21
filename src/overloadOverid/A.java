package overloadOverid;

public class A {

	public static void main(String[] args) {
		System.out.println("A-----Main");
	
		B.main(args);    //We can call main from another main method
	}

	
	
}
