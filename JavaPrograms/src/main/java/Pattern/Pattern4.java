package Pattern;

import java.util.Scanner;

public class Pattern4 {
/*
 * 7654321
 * 765432
 * 76543
 * 7654
 * 765
 * 76
 * 7
 */
	
	
	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=0; i<row; i++) {
			for(int j=row; j>i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
