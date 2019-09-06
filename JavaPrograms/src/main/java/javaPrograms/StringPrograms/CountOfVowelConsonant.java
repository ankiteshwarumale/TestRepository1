package javaPrograms.StringPrograms;

import java.util.Scanner;

public class CountOfVowelConsonant {

	public static void main(String[] args) {
		CountOfVowelConsonant obj = new CountOfVowelConsonant();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String testString = sc.nextLine();
		char array[] = obj.convertToLowerCase(testString);
		System.out.println("Lower case string: ");
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		obj.countVowelConsonant(array);
	}

	public void countVowelConsonant(char arr[]) {
		int vowel=0, consonant=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u') {
				vowel++;
			}else if(arr[i]>='a' && arr[i]<='z') {
				consonant++;
			}
		}
		System.out.println("Vowel: "+vowel+", Consonant: "+consonant);
	}
	
	public char[] convertToLowerCase(String str) {
		char strArray[] = str.toCharArray();
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i]>=65 && strArray[i]<=90)
				strArray[i] = (char)((int)strArray[i]+32);
		}
		return strArray;
		
	}
}
