package abstractConcept;

public class BMW implements Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW--start");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW--stop");
		
	}

	@Override
	public void refule() {
		System.out.println("BMW--refule");
		
	}

	//non overriden method
	public void theifSafety() {
		System.out.println("BMW--Theif safety");
	}
	
}
