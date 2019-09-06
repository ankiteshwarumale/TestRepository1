package javaPrograms.StringPrograms;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SplitStringUsingStringTokenizer {

	public static void main(String[] args) {
		System.out.print("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String var = sc.nextLine();
		StringTokenizer st = new StringTokenizer(var, " ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()+ " "+ st.countTokens());
		}
		sc.close();
	}

}
