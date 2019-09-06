package javaPrograms;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String []args) {
		LinearSearch obj = new LinearSearch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Create & Enter array element:");
		int LinearSearchArray[] = obj.createIntegerArrayAndEnterValues();
		System.out.print("Enter element to find in array: ");
		int findElement =Integer.parseInt(sc.nextLine());
		int index = obj.findElementInArray(LinearSearchArray, findElement);
		if(index==-1)
			System.out.println("Element "+findElement+ " is not present in array");
		else
			System.out.println("Element "+findElement+ " is present in array at index "+index);
	}
	
	public int findElementInArray(int arr[], int findElement) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==findElement)
				return i;
		}
		return -1;
	}

	public int[] createIntegerArrayAndEnterValues() {
		Scanner sc = new Scanner(System.in);
		int arrayLength = 0;
		System.out.print("Enter array length: ");
		arrayLength = Integer.parseInt(sc.nextLine());
		int arr[] = new int[arrayLength];
		
		System.out.println("Enter elements in array:");
		for(int i=0; i<arrayLength; i++) {
			System.out.println("Enter element at "+i+" position: ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		return arr;
	}
}
