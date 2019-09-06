package javaPrograms.StringPrograms;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		System.out.println("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String var = sc.nextLine();
		
		String[] array = var.split(" ");
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]+" ");
		}
		
		StringTokenizer st = new StringTokenizer(var);
		String strReversedLine="";
		while(st.hasMoreTokens()) {
			strReversedLine = st.nextToken()+" " + strReversedLine;
		}
		System.out.println("Reverse word of string: "+strReversedLine);
	
	}

}
