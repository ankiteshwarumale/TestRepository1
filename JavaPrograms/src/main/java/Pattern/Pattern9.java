package Pattern;

import java.util.Scanner;

public class Pattern9 {

	/*
	1 2 3 4 5 6 7
	1 2 3 4 5 6
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2 
	1 
	1 2
	1 2 3 
	1 2 3 4 
	1 2 3 4 5
	1 2 3 4 5 6
	1 2 3 4 5 6 7
	 */
		public static void main(String[] args) {
			System.out.println("Enter number of row:");
			Scanner sc = new Scanner(System.in);
			int row = Integer.parseInt(sc.nextLine());
			for(int i=row; i>0; i--) {
				for(int j=1; j<=i; j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			for(int i=2; i<=row; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}


}
