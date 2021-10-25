package assignment;

import java.util.Scanner;


public class TypeOfAccounts {

	public static void main(String[] args) {
		while (true) {
			// byte action;
			Scanner scanner = new Scanner(System.in);
			System.out.println("--------------------Enter Options---------------------");
			System.out.println("1: Create Saving Account");
			System.out.println("2: Create Current Account");
			System.out.println("AnyOther Number to exit");
			System.out.println("------------------------------------------------------");
			byte choice = scanner.nextByte();
			Account account = null;
			switch (choice) {//Savings Account
			case 1:
				System.out.println("Enter Saving Account Number :" );
				String saving_acc_num = scanner.next();
				scanner.nextLine();
				System.out.println("Enter Saving Account Name : ");
				String saving_acc_name = scanner.nextLine();
				System.out.println("Enter Saving Account Amount : ");
				Float saving_acc_amount = scanner.nextFloat();
				if(SBAccount.MIN_BALANCE < saving_acc_amount) {
					account = new SBAccount();
					account.setAccount_name(saving_acc_name);
					account.setAccount_number(saving_acc_num);
					account.setAmount(saving_acc_amount);
					boolean iscontinue = true;
					while (iscontinue) {
						System.out.println("--------------------Enter Options---------------------");
						System.out.println("1: For Withdrawal");
						System.out.println("2: For Deposit");
						System.out.println("3: For Balance");
						System.out.println("AnyOther Number to exit");
						System.out.println("------------------------------------------------------");
						byte action = scanner.nextByte();
						switch (action) { // Savings Account
						case 1:
							System.out.println("Enter Account Number");
							String acc_num1 = scanner.next();
							scanner.nextLine();
							System.out.println("Enter Amount:");
							float amt1 = scanner.nextFloat();
							account.withdraw(acc_num1, amt1);
							break;
						case 2:
							System.out.println("Enter Account Number");
							String acc_num2 = scanner.next();
							scanner.nextLine();
							System.out.println("Enter Amount:");
							float amt2 = scanner.nextFloat();
							account.deposit(acc_num2, amt2);
							break;
						case 3:
							System.out.println("Enter Account Number");
							String acc_num3 = scanner.next();
							scanner.nextLine();
							System.out.println("Enter Month:");
							int month = scanner.nextInt();
							account.checkbalance(acc_num3, month);
							break;
						default:
							iscontinue = false;
							account = null;
							break;

						}
						
					}
				
				}
				else {
					System.out.println("Amount less than minimum amount of 3000 INR");
				}
				
				break;
			case 2:
				System.out.println("Enter Current Account Number :" );
				String curr_acc_num = scanner.next();
				scanner.nextLine();
				System.out.println("Enter Current Account Name : ");
				String curr_acc_name = scanner.nextLine();
				System.out.println("Enter Current Account Amount : ");
				Float curr_acc_amount = scanner.nextFloat();
				if(CurrentAccount.MIN_BALANCE<curr_acc_amount )
				{
					account = new CurrentAccount();
					account.setAccount_name(curr_acc_name);
					account.setAccount_number(curr_acc_num);
					account.setAmount(curr_acc_amount);
					boolean iscontinuecurr = true;
					while (iscontinuecurr) {
						System.out.println("--------------------Enter Options---------------------");
						System.out.println("1: For Withdrawal");
						System.out.println("2: For Deposit");
						System.out.println("3: For Balance");
						System.out.println("AnyOther Number to exit");
						System.out.println("------------------------------------------------------");
						byte action = scanner.nextByte();
						switch (action) { // Current Account
						case 1:
							System.out.println("Enter Account Number");
							String acc_num21 = scanner.next();
							scanner.nextLine();
							System.out.println("Enter Amount:");
							float amt21 = scanner.nextFloat();
							account.withdraw(acc_num21, amt21);
							break;
						case 2:
							System.out.println("Enter Account Number");
							String acc_num22 = scanner.next();
							scanner.nextLine();
							System.out.println("Enter Amount:");
							float amt22 = scanner.nextFloat();
							account.deposit(acc_num22, amt22);
							break;
						case 3:
							System.out.println("Enter Account Number");
							String acc_num23 = scanner.next();
							scanner.nextLine();
							//System.out.println("Enter Month:");
							//int month = scanner.nextInt();
							account.checkbalance(acc_num23, 0);
							break;
						default:
							iscontinuecurr = false;
							account = null;
							break;
							//System.exit(0);
						}
					}
				}
				else {
					System.out.println("Amount less than minimum amount of 5000 INR");
				}
				break;
			default:
				System.exit(0);

			}
		}
	}
}
