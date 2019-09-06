package javaPrograms;

import java.util.Scanner;

public class ArrayDescendingOrder {

	public static void main(String[] args) {
		ArrayDescendingOrder obj = new ArrayDescendingOrder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Create & Enter array element:");
		int Array[] = obj.createIntegerArrayAndEnterValues();
		int arr[] = obj.sortArrayDescendingOrder(Array);
		System.out.println("Descending Order array: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}		
	
	public int[] sortArrayDescendingOrder(int arr[]) {
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
		
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
		System.out.print("Array: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		return arr;
	}


}
