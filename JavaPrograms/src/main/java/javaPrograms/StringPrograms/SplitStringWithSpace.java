package javaPrograms.StringPrograms;

import java.util.Scanner;

public class SplitStringWithSpace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String var = sc.nextLine();
		String[] array = var.split(" ");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
