package assignment_forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f0=0,f1=1,f2=0,temp;
		System.out.println("Number in Fibonacci Series");
		for(int i=0;i <10; i++)
		{
			System.out.print(f2 +" ");
			f2=f0+f1;
			f1=f0;
			f0=f2;
			
		}

	}

}
