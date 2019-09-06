package javaPrograms.StringPrograms;

import java.util.Scanner;

public class ConcatenateTwoStrings {

	public static void main(String[] args) {
		System.out.println("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String var1 = sc.nextLine();
		String var2 = sc.nextLine();
		System.out.println("Concatenate string:"+var1.concat(var2));
		System.out.println(var1);
		System.out.println(var2);
		var1=var1.concat(var2);
		System.out.println(var1);
	}

}
