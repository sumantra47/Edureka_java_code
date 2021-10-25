package assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		
		for(int i = 0;i<10;i++) {
			number.add(i);
		}
		
		System.out.println("Using Iterator");
		Iterator<Integer> iterator=  number.iterator(); //print array list using iterator
		while(iterator.hasNext())
		{
			Integer n1 = iterator.next();
			System.out.println(n1);
		}

	}

}

