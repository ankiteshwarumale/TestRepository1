package Pattern;

import java.util.Scanner;

public class Pattern14 {
/*
1111111
1111122
1111333
1114444
1155555
1666666
7777777 
 */
	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row; j++) {
				if(j<=(row-i)) {
					System.out.print("1");
				}else
					System.out.print(i);
			}
			System.out.println();
		}
	}

}
