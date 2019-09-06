package Pattern.StarPattern;

import java.util.Scanner;

public class Pattern5 {
/*
    *
   ***
  *****
 *******
*********
 */
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=row; i>0; i--) {
			for(int j=1; j<=row; j++) {
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			for(int k=i; k<row; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
