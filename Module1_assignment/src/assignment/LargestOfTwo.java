package assignment;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 numbers !!");
		Scanner inp = new Scanner(System.in);
		int n1,n2;
		n1 = inp.nextInt();
		n2 = inp.nextInt();
		if (n1 > n2)
		{
			System.out.println(n1 + " is Greater!!");
		}
		else if( n1 == n2)
		{
			System.out.println(n1 + "& " + n2 + " are same!!");
		}
		else
		{
			System.out.println(n2 + " is Greater!!");
		}

	}

}
