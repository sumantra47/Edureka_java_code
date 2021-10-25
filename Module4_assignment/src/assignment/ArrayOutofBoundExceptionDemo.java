package assignment;

public class ArrayOutofBoundExceptionDemo {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		
		try {
			for(int i =0;i<=5;i++) {
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
