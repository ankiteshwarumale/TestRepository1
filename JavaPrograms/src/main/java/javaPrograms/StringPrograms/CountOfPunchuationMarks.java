package javaPrograms.StringPrograms;

import java.util.Scanner;

public class CountOfPunchuationMarks {

	public static void main(String[] args) {
		CountOfPunchuationMarks obj = new CountOfPunchuationMarks();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String testString = sc.nextLine();
		int punchCount = obj.countPunchuationInString(testString);
		System.out.println("Punchuation count in string "+testString+" is "+punchCount);
	}

	public int countPunchuationInString(String testString) {
		int count = 0;
		int size = testString.length();
		for(int i=0; i<size; i++) {
			if(testString.charAt(i)=='!' || testString.charAt(i)==',' || testString.charAt(i)==';' || 
					testString.charAt(i)=='.' || testString.charAt(i)==':' || testString.charAt(i)=='\'' || 
					testString.charAt(i)=='"' ) {
				count++;
			}
		}
		return count;
	}

}
