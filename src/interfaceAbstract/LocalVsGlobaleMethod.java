package interfaceAbstract;

public class LocalVsGlobaleMethod {

	//Global or class variables
	String name="Datta";
	int age=25;
	
	public static void main(String[] args) {

		int i=10;	//Local variables for main methods
		
		//System.out.println(name);	//cannot call static to non static
		LocalVsGlobaleMethod var=new LocalVsGlobaleMethod();
		var.sum();
		System.out.println(var.name);	//call global vars
		System.out.println(i);

	}
	
	public void sum() {
		
		int i=10;	//Local vars for methods
		int j=20;
		System.out.println(age);
		
		
	}

}
