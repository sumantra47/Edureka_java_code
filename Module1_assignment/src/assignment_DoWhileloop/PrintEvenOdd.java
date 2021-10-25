package assignment_DoWhileloop;

import java.util.Scanner;

public class PrintEvenOdd {

	public static void main(String[] args) {

		System.out.println("Enter a number !!");
		Scanner inp = new Scanner(System.in);
		int number,even=0,odd =0, i=0;
		number = inp.nextInt();
		
		if (number % 2 == 0) {
			even = number +2;
			odd = number +1;
		} else {
			odd = number +2;
			even = number +1;
		}

		System.out.println("Ten even number starting from " + number);
		do {
			System.out.print(even);
			System.out.print(" ");
			even += 2;
			i++;
		}while(i<10);
		i=0;
		System.out.println("\nTen Odd number starting from " + number);
		do {
			System.out.print(odd);
			System.out.print(" ");
			odd += 2;
			i++;
		}while(i<10);

	}

}
