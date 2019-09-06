package javaPrograms;

import java.util.Scanner;

public class LargestInArray {

	public static void main(String[] args) {
		ArrayDescendingOrder obj = new ArrayDescendingOrder();
		LargestInArray la = new LargestInArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Create & Enter array element:");
		int Array[] = obj.createIntegerArrayAndEnterValues();
		int arr[] = obj.sortArrayDescendingOrder(Array);
		System.out.print("Descending Order array: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println("5th Largest :"+la.largestInArray(arr, 5));
		
	}

	public int largestInArray(int arr[], int largest) {
		return arr[largest-1];
		
	}

}
