package javaPrograms.StringPrograms;

import java.util.Scanner;

public class FirstAlphabetCapitalOfEachWord {

	public static void main(String[] args) {
		System.out.println("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String var = sc.nextLine();
		String upperCaseWord = "";
		String[] array = var.split(" ");
		int i=0;
		int count = array.length;
		while(count-- > 0) {
			upperCaseWord  = upperCaseWord.concat(String.valueOf(Character.toUpperCase(array[i].charAt(0))).concat(array[i].substring(1)))+" ";
			i++;
		}
		System.out.println(upperCaseWord);
	}

}
