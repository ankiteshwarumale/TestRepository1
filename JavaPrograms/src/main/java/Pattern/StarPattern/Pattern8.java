package Pattern.StarPattern;

import java.util.Scanner;

public class Pattern8 {
/*
*
**
***
****
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
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=row-1; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
