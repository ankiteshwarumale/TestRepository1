package Pattern;

import java.util.Scanner;

public class Pattern15 {
/*
1010101
0101010
1010101
0101010
1010101
0101010
1010101
 */
	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row; j++) {
				if(i%2!=0)
					if(j%2!=0)
						System.out.print("1");
					else
						System.out.print("0");
				else
					if(j%2!=0)
						System.out.print("0");
					else
						System.out.print("1");
			}
			System.out.println();
		}
	}

}
