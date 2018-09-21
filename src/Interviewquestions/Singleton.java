package Interviewquestions;

public class Singleton {

	//IN OOP, a singleton class that can have only one object or instance of the class at a time
	//How to design singleton class:
	//1. make constructor as private
	//2. Write public static method that has return type of object of singleton class(lazy initialization)
	
	private static Singleton singleton_instance=null;
	
	public String str;
	
	private Singleton() {
		str="Singleton class pattern";
		System.out.println("Hello");
	}
	
	public static Singleton getInstance() {
		
		if(singleton_instance==null) 
			singleton_instance=new Singleton();
		return singleton_instance;
		
	}
	public static void main(String[] args) {
	

		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
	}

}
