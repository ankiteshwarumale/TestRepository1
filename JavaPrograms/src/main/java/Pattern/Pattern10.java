package Pattern;

import java.util.Scanner;

public class Pattern10 {
/*
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
 */
	public static void main(String[] args) {
		System.out.println("Enter number of row:");
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row; j++) {
				if(j<i) {
					System.out.print(" ");
				}else if(j>=i) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		for(int i=row-1; i>0; i--) {
			for(int j=1; j<=row; j++){
				if(j<i) {
					System.out.print(" ");
				}else if(j>=i) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
