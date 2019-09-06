package javaPrograms.StringPrograms;

import java.util.Scanner;

public class LastIndexOfCharInString {

	public static void main(String[] args) {
		System.out.println("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String var = sc.nextLine();
		System.out.println("Length"+var.length());
		String charVar = sc.nextLine();
		for(int i=var.length()-1; i>=0; i--) {
			if(var.charAt(i)==charVar.charAt(0)) {
				System.out.println("Character "+charVar.charAt(0)+ "in string: "+ var + "at last index: "+i);
				break;
			}
		}
		
	}

}
