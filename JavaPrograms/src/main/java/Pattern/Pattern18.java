package Pattern;

import java.util.Scanner;

public class Pattern18 {
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=1, count=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((count++)+" ");
			}
			System.out.println();
		}
	}

}
