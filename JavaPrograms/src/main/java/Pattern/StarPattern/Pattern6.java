package Pattern.StarPattern;

import java.util.Scanner;

public class Pattern6 {
	/*
	*********
	 *******
	  *****
	   ***
	    *
	 */
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row; j++) {
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int k=i+1; k<=row; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
