package interfaceAbstract;

public interface USBank {

	
	int min_balance=100;
	
	public void credit();
	public void debit();
	
	public void transferMoney();
	
	/*Only method declaration
	 * No method body
	 * variables are static in nature by default,, value can't bechanged
	 * Interface is abstract in nature --cant create object
	 * No main methods
	 * no static methods
	 * */
}
