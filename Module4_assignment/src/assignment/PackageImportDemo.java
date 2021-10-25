package assignment;

import function.FunctionClass;

public class PackageImportDemo {

	public static void main(String[] args) {
		FunctionClass f1 = new FunctionClass();
		System.out.println("Multiplication :" + f1.mul(4, 5));
		System.out.println("Substraction :" + f1.subtract(40, 5));
		System.out.println("Divide :" + f1.divide(20, 4));
		System.out.println("Factorial  :" + f1.factorial(5));
		f1.reverse(12345);
		

	}

}
