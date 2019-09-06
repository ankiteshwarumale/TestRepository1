package javaPrograms;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {
		AddTwoMatrix obj = new AddTwoMatrix();
		int [][]arr1 = obj.createMultiDimensionalArray(2, 3);
		System.out.println("1st Array:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j<arr1[0].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		int [][]arr2 = obj.createMultiDimensionalArray(2, 3);
		System.out.println("2nd Array:");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0; j<arr2[0].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		//No Of Rows: arr.length
		//No. of Columns: arr[0].length
		int result[][] = obj.addMultiDimensionalArray(arr1, arr2);
		System.out.println("Add Result:");
		for(int i=0;i<result.length;i++) {
			for(int j=0; j<result[0].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	public int[][] addMultiDimensionalArray(int arr1[][], int arr2[][]){
		int result[][] = new int[arr1.length][arr1[0].length];
		for(int i=0; i<arr1.length;i++) {
			for(int j=0; j<arr1[0].length;j++) {
				result[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		return result;
	}

	public int[][] createMultiDimensionalArray(int row, int col){
		int arr[][] = new int[row][col];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values in array:");
		for(int i=0;i<row;i++) {
			for(int j=0; j<col; j++) {
				System.out.print("Enter value of row "+i+ ", col "+j+":");
				arr[i][j] = Integer.parseInt(sc.nextLine());
				System.out.println();
			}
		}
		return arr;
		
	}
}
