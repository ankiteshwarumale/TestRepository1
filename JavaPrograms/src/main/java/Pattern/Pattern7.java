package Pattern;

import java.util.Scanner;

public class Pattern7 {
/*
7
7 6 
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2 
7 6 5 4 3 2 1 
 */
	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=row; i>0; i--) {
			for(int j=row; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
