package overloadOverid;

public class B {

	public static void main(String[] args) {
		System.out.println("B--main");

	//	A.main(args);	// Stack overflow.. In this case it will call main method of A again the A class call B's main method so it calling from one to another and last giveing error i.e. stack overflow
	}

}
