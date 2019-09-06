package Pattern;

import java.util.Scanner;

public class Pattern19 {
/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5 
6 6 6 6 6 6
7 7 7 7 7 7 7 
 */
	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
