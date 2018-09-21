package Interviewquestions;

public class FinalizeConcep {

	//for clean process before cleaning
	
	public void finalize() {
		System.out.println("Finalize method");
	}
	
	public static void main(String[] args) {
		
		FinalConcept f1=new FinalConcept();
		FinalConcept f2=new FinalConcept();
		FinalConcept f3=new FinalConcept();
		
		System.out.println("main");
		
		f1=null;
		f2=null;
		f3=null;
		System.gc();
		
	}
}
