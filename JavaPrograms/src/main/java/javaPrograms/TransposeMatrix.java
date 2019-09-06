package javaPrograms;

public class TransposeMatrix {

	public static void main(String[] args) {
		TransposeMatrix trans = new TransposeMatrix();
		AddTwoMatrix obj = new AddTwoMatrix();
		int [][]arr1 = obj.createMultiDimensionalArray(2,3);
		System.out.println("1st Array:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j<arr1[0].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		trans.transposeMatrix(arr1);
	}

	public void transposeMatrix(int arr[][]) {
		
		int transpose[][] = new int[arr[0].length][arr.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				transpose[j][i]=arr[i][j];
			}
		}
		System.out.println("Transpose Matrix:");
		for(int i=0; i<transpose.length; i++) {
			for(int j=0; j<transpose[0].length; j++){
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}
}
