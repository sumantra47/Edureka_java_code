package assignment;

import java.util.Scanner;

public class QueueDemo {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Queue Demo Interface");
		QueueClass q1 = new QueueClass();
		while (flag) {
			System.out.println("Option 1 : Insert");
			System.out.println("Option 2 : Delete");
			System.out.println("Any other Integer to Exit");
			int action;
			try {
				action = scanner.nextInt();
				switch (action) {
				case 1:
					System.out.println("Insert a char");
					String in = scanner.next();
					scanner.nextLine();
					q1.insert(in);
					break;
				case 2:
					System.out.println("Delete a char");
					String del = scanner.next();
					scanner.nextLine();
					q1.delete(del);
					break;
				default:
					flag = false;
				}
			} catch (Exception e) {
				System.out.println("Invalid Input");
				e.printStackTrace();
				scanner.next();
			}

		}

	}

}
