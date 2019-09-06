package javaPrograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no to check armstrong or not: ");
		String userInput = input.nextLine();
		int isArmstrongNo = Integer.parseInt(userInput);
		Armstrong arm = new Armstrong();
		boolean result = arm.isArmstrong(isArmstrongNo);
		if(result==true) {
			System.out.println(isArmstrongNo+" is Armstrong no");
		}
		else
			System.out.println(isArmstrongNo+" is not Armstrong no");
	}
	
	public boolean isArmstrong(int isArmStrongNo) {
		int temp = isArmStrongNo, sum=0, rem=0;
		while(isArmStrongNo>0) {
			rem= isArmStrongNo % 10;
			sum = sum + (rem*rem*rem);
			isArmStrongNo = isArmStrongNo / 10;
		}
		
		if(temp==sum)
			return true;
		else
			return false;
	}

}
