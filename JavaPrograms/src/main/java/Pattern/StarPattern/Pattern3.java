package Pattern.StarPattern;

import java.util.Scanner;

public class Pattern3 {
/*
*****
**** 
***  
**   
*
 */
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=row; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
