package javaPrograms.StringPrograms;

import java.util.Scanner;

public class IntegerToStringConversion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String testString = sc.nextLine();
		
		int intVar = Integer.parseInt(testString);
		System.out.println("Integer: "+intVar);
		
		String intToString = Integer.toString(intVar);
		System.out.println("String: "+intToString);
		
		
		/*If alphanumeric string converted into integer, it will give number format exception*/
		sc.close();
	}

}
