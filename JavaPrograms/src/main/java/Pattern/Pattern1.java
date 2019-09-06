package Pattern;

import java.util.Scanner;

public class Pattern1 {
	/*
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * 123456
	 * 1234567
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		for(int i=0; i<row; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}

}
