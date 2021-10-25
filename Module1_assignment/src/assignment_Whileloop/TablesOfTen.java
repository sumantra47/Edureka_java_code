package assignment_Whileloop;

import java.util.Scanner;

public class TablesOfTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number !!");
		Scanner inp = new Scanner(System.in);
		int n1 =inp.nextInt();
		int i=1;
		System.out.println("Table of 10 till " + n1*10);
		
		while(i<=n1)
		{
			System.out.print(10*i + " ");
			i++;
		}

	}

}
