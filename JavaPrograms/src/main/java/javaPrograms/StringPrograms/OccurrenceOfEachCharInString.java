package javaPrograms.StringPrograms;

import java.util.Scanner;

public class OccurrenceOfEachCharInString {

	public static void main(String[] args) {
		System.out.println("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] array = str.toCharArray();
		int[] occurrenceOfChar = new int[array.length];
		
		for(int i=0; i<array.length; i++) {
			int count = 1;
			for(int j=i+1; j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
					occurrenceOfChar[j]=-1;
				}
			}
			if(occurrenceOfChar[i]!=-1)
				occurrenceOfChar[i]=count;
		}
		
		for(int k=0; k<occurrenceOfChar.length; k++) {
			if(occurrenceOfChar[k]!= -1) {
				System.out.println(array[k]+" "+occurrenceOfChar[k]+" times");
			}
		}
	}

}
