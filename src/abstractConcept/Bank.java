package abstractConcept;

public abstract class Bank {

	public int a=10;
	final int rate=100;
	static int ra2=200;
	//Partial abstraction
	//Hiding implementation logic is called abstarction
	//Atleast 1 abstract method should be there in abstract class
	//have both abstratct and non abstract methods
	//Can not create object of abstract class 
	public abstract void loan();	//No method body
	
	
	//Non abstract methods 
	public void credit() {
		System.out.println("Credit... Bank");
	}
	public void debit() {
		System.out.println("Dedit... Bank");
	}
	
}
