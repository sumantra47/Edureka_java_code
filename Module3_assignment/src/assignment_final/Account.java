package assignment_final;

public abstract class Account {
	
	String account_name;
	String account_number;
	float amount;
	
	public Account(String account_name, String account_number, float amount) {
		super();
		this.account_name = account_name;
		this.account_number = account_number;
		this.amount = amount;
	}
		
	public abstract void withdraw(String account_number,float amt);	
	public abstract void deposit(String account_number,float amt);
	public abstract void checkbalance(String account_number, int month);

}
