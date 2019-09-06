package javaPrograms.StringPrograms;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SeparateStringUsingStringTokenizer {

	public static void main(String[] args) {
		System.out.println("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		System.out.println("Total tokens: "+st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
