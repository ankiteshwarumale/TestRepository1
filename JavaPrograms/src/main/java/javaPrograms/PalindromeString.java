package javaPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String str, rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check palindrome string or not:");
		str = sc.nextLine();
		int length = str.length();
		for(int i=length-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)) 
			System.out.println(str+ " is a palindrome string");
		else 
			System.out.println(str+ " is not a palindrome string");
	}

}
