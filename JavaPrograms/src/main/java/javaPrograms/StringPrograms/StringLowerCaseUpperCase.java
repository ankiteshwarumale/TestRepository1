package javaPrograms.StringPrograms;

import java.util.Scanner;

public class StringLowerCaseUpperCase {

	public static void main(String[] args) {
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String var = sc.nextLine();
		
		String lowerCase = var.toLowerCase();
		String upperCase = var.toUpperCase();
		
		System.out.println("LowerCase: "+lowerCase);
		System.out.println("UpperCase: "+upperCase);
		
		//convert to lowercase
		String lower = "";
		for(int i=0; i<var.length(); i++) {
			if(var.charAt(i)>=65 && var.charAt(i)<=90) {
				lower = lower + (char)(var.charAt(i)+32);
			}
			else
				lower = lower + var.charAt(i);
		}
		System.out.println("Lower: "+lower);
		
		//convert to uppercase
				String upper = "";
				for(int i=0; i<var.length(); i++) {
					if(var.charAt(i)>=97 && var.charAt(i)<=122) {
						upper = upper + (char)(var.charAt(i)-32);
					}
					else
						upper = upper + var.charAt(i);
				}
				System.out.println("Upper: "+upper);
	}

}
