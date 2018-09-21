package abstractConcept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HDFCBank bank=new HDFCBank();
		bank.credit();
		bank.debit();
		bank.fund();
		System.out.println("____________");
		
		Bank b=new HDFCBank();	//Dynamic poly
		b.loan();
		b.credit();
		b.debit();
		//b.fund();		Not available
		System.out.println("____________");
		
		Car car=new BMW();
		
		car.start();
		car.stop();
		car.refule();
		//ar.theifSafety();		Not alloed
		
		System.out.println("____________");
		BMW bmw=new BMW();
		bmw.start();
		bmw.start();
		bmw.refule();
		bmw.theifSafety();//Allow
	}

}
