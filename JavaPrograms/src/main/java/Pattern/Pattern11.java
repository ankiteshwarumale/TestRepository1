package Pattern;

import java.util.Scanner;

public class Pattern11 {
/*

1
2 1
3 2 1
4 3 2 1
5 4 3 2 1 
6 5 4 3 2 1
7 6 5 4 3 2 1
 
 */
	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<=row; i++) {
			for(int j=i; j>0; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
