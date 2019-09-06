package javaPrograms;

import java.util.Scanner;

public class OccurrenceInArray {

	public static void main(String[] args) {
		OccurrenceInArray obj = new OccurrenceInArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Create & Enter array element:");
		int Array[] = obj.createIntegerArrayAndEnterValues();
		obj.occurrencesCountInArray(Array);
		obj.duplicateElement(Array);
	}

	public void occurrencesCountInArray(int arr[]) {
		int freqOfOccurrence[] = new int[arr.length];
		int visited = -1;
		
		for(int i=0; i<arr.length; i++) {
			int count=1;
			for(int j=i+1; j<arr.length; j++) 
			{
				if(arr[i] == arr[j]) {
					count++;
					freqOfOccurrence[j] = visited;
				}
			}
			if(freqOfOccurrence[i] != visited) {
				freqOfOccurrence[i] = count;
			}			
		}
		System.out.println("NumberInArray |  NumberFrequency");
		for(int j=0; j<freqOfOccurrence.length; j++) {
			if (freqOfOccurrence[j]!=visited) {
				System.out.println(arr[j]+ "             |   "+ freqOfOccurrence[j]);
			}
		}
	}
	
	public void duplicateElement(int arr[]) {
		int freqOfOccurrence[] = new int[arr.length];
		int visited = -1;
		
		for(int i=0; i<arr.length; i++) {
			int count=1;
			for(int j=i+1; j<arr.length; j++) 
			{
				if(arr[i] == arr[j]) {
					count++;
					freqOfOccurrence[j] = visited;
				}
			}
			if(freqOfOccurrence[i] != visited) {
				freqOfOccurrence[i] = count;
			}			
		}
		System.out.println("Duplicate element in array:");
		for(int j=0; j<freqOfOccurrence.length; j++) {
			if ((freqOfOccurrence[j]!=visited) & (freqOfOccurrence[j]>1)) {
				System.out.println(arr[j]);
			}
		}
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
