package Pattern;

import java.util.Scanner;

public class Pattern17 {
/*
0000000 
0100000 
0020000
0003000
0000400
0000050
0000006
 */
	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=0; i<row; i++) {
			for(int j=0; j<row; j++) {
				if(i==j) {
					System.out.print(i);
				}else
					System.out.print("0");
			}
			System.out.println();
		}
	}

}
