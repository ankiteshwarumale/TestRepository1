package Pattern.StarPattern;

import java.util.Scanner;

public class Pattern10 {
/*
    *****
   *****
  *****
 *****
*****
 */
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=row; i>=1; i--) {
			for(int j=1; j<=row; j++) {
				if(j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=row; i>=1; i--) {
			for(int j=1; j<=row; j++) {
				if(j==i) {
					System.out.print("*");
					break;
				}
				else
					System.out.print(" ");
			}
			for(int k=row; k>1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
