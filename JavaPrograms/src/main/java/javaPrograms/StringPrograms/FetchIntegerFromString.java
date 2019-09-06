package javaPrograms.StringPrograms;

import java.util.Scanner;

public class FetchIntegerFromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string:");
		String var = sc.nextLine();
		char array[] = var.toCharArray();
		for(int i=0; i<array.length; i++) {
			if(array[i]>=48 && array[i]<=57) {
				System.out.print(array[i]);
			}
		}
	}

}
