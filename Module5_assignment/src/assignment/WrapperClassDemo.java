package assignment;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int i =10;
		Integer integer = i;
		Integer integer2 = 100;//integer / integer2 are wrapper obj
		Integer integer3 =Integer.valueOf(i);
		System.out.println();
		System.out.println("Unboxing : " + integer2.intValue()); //Unboxing
		System.out.println(Integer.valueOf(i));
		String s ="200";
		int j= Integer.parseInt(s);
		System.out.println(j);
		System.out.println("to String :" + integer3.toString());

	}

}
