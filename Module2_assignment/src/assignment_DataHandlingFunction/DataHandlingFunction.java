package assignment_DataHandlingFunction;

import java.util.Scanner;

public class DataHandlingFunction {

	public static void display(String[][] s1) {
		System.out.println("------------------------------------------------------");
		System.out.println("|       ID        |       Name        |     Salary   |");
		System.out.println("------------------------------------------------------");
		int row = s1.length;
		for (int i = 0; i < row; i++) {
			System.out.println("|       " + s1[i][0].trim() + "        |       " + s1[i][1].trim() + "        |    "
					+ s1[i][2].trim() + "   |");

		}
		System.out.println("------------------------------------------------------");

	}

	public static void display(int[] s1, String[] s2) {
		System.out.println("---------------------------------------");
		System.out.println("|       ID        |       Name        |");
		System.out.println("---------------------------------------");
		int row = s1.length;
		for (int i = 0; i < row; i++) {
			System.out.println("|       " + s1[i] + "        |       " + s2[i].trim() + "        |");

		}
		System.out.println("----------------------------------------");
	}

	public static void display(String string, int[] regno, String[] name, double[] salary) {
		// TODO Auto-generated method stub
		int r = regno.length;
		int flag=1;
		for (int i = 0; i < r; i++) {
			if (name[i].equals(string)) {
				System.out.println("------------------------------------------------------");
				System.out.println("|       ID        |       Name        |     Salary   |");
				System.out.println("------------------------------------------------------");
				System.out.println("|       " + regno[i] + "        |       " + name[i].trim() + "        |    "
						+ salary[i] + "   |");
				flag=0;
				break;
			}
		
		}
		if (flag==1) {
			System.out.println("Employee Name not present");
		}

	}

	public static String[] getcolumn(String[][] s1, int index) {
		int row = s1.length;
		String[] s2 = new String[row];
		for (int i = 0; i < row; i++) {
			s2[i] = s1[i][index].trim();
		}
		return s2;
	}

	public static double[] convertdouble(String[][] s1, int index) {
		int row = s1.length;
		double[] s2 = new double[row];
		String[] s3 = new String[row];
		s3 = getcolumn(s1, index);
		for (int i = 0; i < row; i++) {
			s2[i] = Double.parseDouble(s3[i].trim());
		}
		return s2;
	}

	public static int[] convertint(String[][] s1, int index) {
		int row = s1.length;
		int[] s2 = new int[row];
		String[] s3 = new String[row];
		s3 = getcolumn(s1, index);
		for (int i = 0; i < row; i++) {
			s2[i] = Integer.parseInt(s3[i].trim());
		}
		return s2;
	}

	public static void main(String[] args) {
		System.out.println("Enter the 5 Employee Details");
		Scanner scanner = new Scanner(System.in);
		String[][] employee = new String[5][3];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				employee[i][j] = scanner.nextLine();

			}
		}
		//Question 1
		display(employee);
		String[] name = new String[employee.length];
		int[] regno = new int[employee.length];
		double[] salary = new double[employee.length];
		regno = convertint(employee, 0);
		name = getcolumn(employee, 1);
		salary = convertdouble(employee, 2);
		System.out.println(regno);
		System.out.println(name);
		System.out.println(salary);
		//Question 2
		display(regno, name);
		//Question 3
		display("Ravi", regno, name, salary);

	}


}
