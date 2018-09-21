package interfaceAbstract;

public class HSBCBank implements USBank{
	
	@Override
	public void credit() {
		
		System.out.println("HSBC bank credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub
		
	}
	
	public void hsbcMethod() {
		System.out.println("HSBC ");
	}
	
	
	public static void main(String[] args) {
		USBank us=new HSBCBank();
		us.credit();
		
		HSBCBank bank=new HSBCBank();
		bank.hsbcMethod();
		
	}
	
}
