package javaPrograms;

public class LowerTraingularMatrix {

	public static void main(String[] args) {
		LowerTraingularMatrix lower = new LowerTraingularMatrix();
		AddTwoMatrix obj = new AddTwoMatrix();
		int [][]arr1 = obj.createMultiDimensionalArray(3,3);
		System.out.println("1st Array:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j<arr1[0].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		lower.lowerTriangularMatrix(arr1);
	}
	
	public void lowerTriangularMatrix(int arr[][]) {
		int row=0, col=0;
		row=arr.length;
		col=arr[0].length;
		if(row!=col)
			System.out.println("Array should be square matrix");
		else {
			System.out.println("LowerTriangularMatrix:");
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					if(j>i) {
						System.out.print("0"+" ");
					}
					else
						System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
