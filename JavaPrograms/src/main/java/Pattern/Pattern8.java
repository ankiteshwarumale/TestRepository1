package Pattern;

import java.util.Scanner;

public class Pattern8 {
/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
 */
	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			for(int k=i-1; k>0; k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
