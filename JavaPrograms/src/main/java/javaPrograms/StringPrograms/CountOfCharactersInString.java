package javaPrograms.StringPrograms;

import java.util.Scanner;

public class CountOfCharactersInString {

	public static void main(String[] args) {
		CountOfCharactersInString obj = new CountOfCharactersInString();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String testString = sc.nextLine();
		int charCount = obj.countCharInString(testString);
		System.out.println("Character count in string "+testString+" is "+charCount);
	}
	
	public int countCharInString(String testString) {
		int count = 0;
		int size = testString.length();
		for(int i=0; i<size; i++) {
			if(testString.charAt(i) != ' ') {
				count++;
			}
		}
		return count;
	}

}
