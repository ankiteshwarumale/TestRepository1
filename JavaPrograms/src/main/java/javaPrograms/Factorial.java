package javaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial: ");
		//f.factNum(Integer.parseInt(sc.nextLine()));
		System.out.println("Factorial of f.factNumRecursion(5): "+f.factNumRecursion(6));
	}
	
	public void factNum(int number) {
		int fact =1;
		for(int i=number; i>=1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+number+ " is "+fact);	
	}
	
	public int factNumRecursion(int number) {
		
		if(number==0)
			return 1;
		else
			return (number * factNumRecursion(number-1));
	}

}
