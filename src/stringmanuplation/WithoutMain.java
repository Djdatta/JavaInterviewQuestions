package stringmanuplation;

public class WithoutMain {

	static {
		System.out.println("static block...");
	}
	public static void main(String[] args) {
		System.out.println("main");
	}
}



/*If no main method
 * after 1.7--before 1.7 System.exit(0) in static block then program execute
 * Error:
 * 
 * Error: Main method not found in class stringmanuplation.WithoutMain, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
 * 
 * */
 