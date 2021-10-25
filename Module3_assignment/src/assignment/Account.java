package assignment;

public abstract class Account {
	
	private String account_name;
	private String account_number;
	private float amount;
		
	public abstract void withdraw(String account_number,float amt);	
	public abstract void deposit(String account_number,float amt);
	public abstract void checkbalance(String account_number, int month);
	
	
	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", account_name=" + account_name + "]";
	}
	
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
}
