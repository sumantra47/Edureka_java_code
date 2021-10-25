package assignment;

public final class SBAccount extends Account {

	static final int MIN_BALANCE = 3000;
	static final int INTEREST = 4;

	public void withdraw(String account_number, float amt) {
		if (this.getAccount_number().equals(account_number)) {
			if (amt <= this.getAmount()) {
				this.setAmount(this.getAmount() - amt);
				System.out.println(" Account NUmber :" + account_number);
				System.out.println(" Balance :" + this.getAmount());
			} else {
				System.out.println("Insufficient Balance :" + account_number);
			}
		} else {
			System.out.println("Invalid Account Number :" + account_number);
		}

	}

	@Override
	public void deposit(String account_number, float amt) {
		if (this.getAccount_number().equals(account_number)) {
			this.setAmount(this.getAmount() + amt);
			System.out.println(" Account NUmber :" + account_number);
			System.out.println(" Balance :" + this.getAmount());
		} else {
			System.out.println("Invalid Account Number :" + account_number);
		}

	}

	@Override
	public void checkbalance(String account_number, int month) {
		if (this.getAccount_number().equals(account_number)) {
			this.setAmount(this.getAmount() + (this.getAmount() * INTEREST * month) / 100);
			System.out.println("Account Number :" + account_number);
			System.out.println("Balance : " + this.getAmount());
		} else {
			System.out.println("Invalid Account Number :" + account_number);
		}
	}

}
