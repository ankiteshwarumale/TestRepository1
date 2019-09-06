package javaPrograms.StringPrograms;

import java.util.Scanner;

public class StringToIntConversion {

	public static void main(String[] args) {
		//StringToIntConversion obj = new StringToIntConversion();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String testString = sc.nextLine();
		
		int intVar = Integer.parseInt(testString);
		System.out.println(intVar);
		
		/*If alphanumeric string converted into integer, it will give number format exception*/
		sc.close();

	}

}
