package abstractConcept;

public interface Car {

	int wheels=4;	//by defaults its final
	//To hide all data use interface
	//By defaults all methods are abstract 
	//No method body --only declaration
	//to achive 100% abstraction
	//Can not create object of Interface
	public void start();
	public void stop();
	public void refule();
	
}
