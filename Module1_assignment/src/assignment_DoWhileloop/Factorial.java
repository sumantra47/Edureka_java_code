package assignment_DoWhileloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a numbers !!");
		Scanner inp = new Scanner(System.in);
		int n1 =inp.nextInt();
		int fact =1;
		
		if(n1 ==0 | n1 ==1)
		{
			fact =1;
		}else
		{
			int i=n1;
			do {
				fact=fact*i;
				i--;
			}while(i>1);
		}
		
		System.out.println(fact);

	}

}
