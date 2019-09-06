//https://www.javainterviewpoint.com/star-pattern-programs-in-java/

package Pattern.StarPattern;

import java.util.Scanner;

public class Pattern1 {
/*
*
**
***
****
*****
 */
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=0; i<row; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
