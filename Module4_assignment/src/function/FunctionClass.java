package function;

public class FunctionClass {

	public int mul(int x, int y) {
		return (x * y);
	}

	public int subtract(int x, int y) {
		return (x - y);
	}

	public float divide(int x, int y) {
		return (x / y);
	}

	public void reverse(int x) {
		int rem = 0;
		//System.out.println("Number in reverse order");
		System.out.println("Number in reverse order");
		while (x > 9) {
			rem = x % 10;
			x = x / 10;
			System.out.print(rem);
		}
		System.out.print(x);

	}

	public int factorial(int x) {
		int fact = 1;

		if (x == 0 | x == 1) {
			fact = 1;
		} else {
			int i = x;
			while (i > 1) {
				fact = fact * i;
				i--;
			}
		}

		// System.out.println(fact);
		return fact;

	}

}
