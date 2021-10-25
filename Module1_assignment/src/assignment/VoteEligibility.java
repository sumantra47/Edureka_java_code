package assignment;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your age !!");
		Scanner inp = new Scanner(System.in); 
		int age;
		age = inp.nextInt();
		if (age > 18)
		{
			System.out.println("Eligible to vote!!");
		}
		else
		{
			System.out.println("Not eligible to vote!!");
		}

	}

}


