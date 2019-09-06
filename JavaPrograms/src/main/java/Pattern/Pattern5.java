package Pattern;

import java.util.Scanner;

public class Pattern5 {
/*
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=row; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

}
