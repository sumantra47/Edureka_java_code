package assignment;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		System.out.println("Enter a numbers !!");
		Scanner inp = new Scanner(System.in);
		int n1;
		n1 = inp.nextInt();
		if (n1%2 == 0)
		{
			System.out.println(n1 + " is Even!!");
		}
		else
		{
			System.out.println(n1 + " is Odd!!");
		}

	}

}
