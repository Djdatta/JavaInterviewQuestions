package interfaceAbstract;

public class StaticVsNonStatic {

	//Global vars
	String name="Datta";
	static int age=23;
	
	public static void main(String[] args) {
		
		System.out.println(age);	//call without creation of objects
		
		//System.out.println(name);  Not possible static to non static
		
		StaticVsNonStatic s=new StaticVsNonStatic();
		
		System.out.println(s.name); 	//To access non static--using object
		s.m1();
		m2();	//static to static call ..s.m2() alos can do but not good practice
	}

	
	public void m1() {
		
		System.out.println(age);	//Non static to static allowed
		System.out.println(name);
	}
	public static void m2() {
		System.out.println(age);
		//System.out.println(name);		//Static to non static not allowed
		
		
	}
}
