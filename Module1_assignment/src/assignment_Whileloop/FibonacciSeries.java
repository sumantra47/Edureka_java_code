package assignment_Whileloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f0=0,f1=1,f2=0,i=0;
		System.out.println("Number in Fibonacci Series");
		while(i<10)
		{
			System.out.print(f2 +" ");
			f2=f0+f1;
			f1=f0;
			f0=f2;
			i++;
			
		}

	}

}
