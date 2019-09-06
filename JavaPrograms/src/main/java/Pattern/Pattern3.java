package Pattern;

import java.util.Scanner;

public class Pattern3 {/*
1
22
333
4444
55555
666666
7777777
*/

	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=row; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
