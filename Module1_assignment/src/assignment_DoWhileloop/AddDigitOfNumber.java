package assignment_DoWhileloop;

import java.util.Scanner;

public class AddDigitOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number !!");
		Scanner inp = new Scanner(System.in);
		int n1 =inp.nextInt();
		int sum=0,rem=0;
		do
		{
			rem= n1%10;
			n1=n1/10;
			sum=sum + rem;
		}while(n1 >9);
		sum=sum+n1;
		System.out.println("Sum of digits: " + sum);
	}

}
