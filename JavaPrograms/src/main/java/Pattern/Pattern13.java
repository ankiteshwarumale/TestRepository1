package Pattern;

import java.util.Scanner;

public class Pattern13 {
/*
1 2 3 4 5 6 7 
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7
 */
	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row; j++) {
				if(j<i) {
					System.out.print(" ");
				}
				else
					System.out.print(j+" ");
				
			}
			System.out.println();
		}
		for(int i=row-1; i>0; i--) {
			for(int j=1; j<=row; j++) {
				if(j>=i) {
					System.out.print(j+" ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
