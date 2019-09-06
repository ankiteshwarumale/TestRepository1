package Pattern;

import java.util.Scanner;

public class Pattern2 {
	/*
	 * 1
12
123
1234
12345
123456
1234567
12345678
1234567
123456
12345
1234
123
12
1
	 */

	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=0; i<(row/2)+1; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		for(int i=row-1; i>row/2; i--) {
			for(int j=0; j<i-(row/2); j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

}
