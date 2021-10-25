package assignment;

import java.util.Scanner;

public class PosNegNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number !!");
		Scanner inp = new Scanner(System.in); 
		int num;
		num = inp.nextInt();
		if (num >= 0)
		{
			System.out.println("Number is positive!!");
		}
		else
		{
			System.out.println("Number is negative!!");
		}


	}

}
