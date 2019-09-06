package Pattern;

import java.util.Scanner;

public class Pattern16 {
/*
1
2 6
3 7 10 
4 8 11 13
5 9 12 14 15
 */
	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=row; i++) {
			int num=i;
			for(int j=1; j<=i; j++) {
				System.out.print(num+" ");
				num=num+row-j;
			}
			System.out.println();
		}
		
	}

}
