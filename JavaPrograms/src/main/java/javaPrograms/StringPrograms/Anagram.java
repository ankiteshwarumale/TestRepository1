package javaPrograms.StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		/* Two Strings are called the anagram if they contain the same characters.
		 *  However, the order or sequence of the characters can be different.*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 string to check anagram: ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		if(str1.length()!=str2.length()) {
			System.out.println("Length of both string should be same to check anagram");
		}
		else {

			char[] array1 = str1.toCharArray();
			char[] array2 = str2.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			String sortedStr1 = (String.valueOf(array1)).toLowerCase();
			String sortedStr2 = (new String(array2)).toLowerCase();
			
			if(sortedStr1.equals(sortedStr2)) {
				System.out.println("Strings are anagram");
			}else
				System.out.println("Strings are not anagram");
		}*/
		System.exit(0);
	}

}
