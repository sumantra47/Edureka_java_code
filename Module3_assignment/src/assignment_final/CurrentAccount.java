package assignment_final;

public final class CurrentAccount extends Account {

	static final float MIN_BALANCE = 5000;

	public CurrentAccount(String account_name, String account_number, float amount) {
		super(account_name, account_number, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(String account_number, float amt) {
		if (this.account_number.equals(account_number)) {
			if (amt <= this.amount) {
				this.amount -= amt;
				System.out.println(" Account Number :" + account_number);
				System.out.println(" Balance :" + this.amount);
			} else {
				System.out.println("Insufficient Balance :" + account_number);
			}

		} else {
			System.out.println("Invalid Account number: " + account_number);
		}
	}

	@Override
	public void deposit(String account_number, float amt) {
		if (this.account_number.equals(account_number)) {
			this.amount += amt;
			System.out.println(" Account Number :" + account_number);
			System.out.println(" Balance :" + this.amount);
		} else {
			System.out.println("Invalid Account number: " + account_number);
		}

	}

	@Override
	public void checkbalance(String account_number, int month) {
		if (this.account_number.equals(account_number)) {
			System.out.println("Account Number :" + account_number);
			System.out.println("Balance : " + this.amount);
		} else {
			System.out.println("Invalid Account number: " + account_number);
		}

	}

}
