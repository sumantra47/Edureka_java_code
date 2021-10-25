package assignment_Whileloop;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		System.out.println("Enter a number !!");
		Scanner inp = new Scanner(System.in);
		int n1 =inp.nextInt();
		int sum=0,rem=0;
		System.out.println("Number in reverse order");
		while(n1>9)
		{
			rem= n1%10;
			n1=n1/10;
			sum=sum + rem;
			//System.out.print(rem);
		}
		System.out.print(n1);

	}

}
