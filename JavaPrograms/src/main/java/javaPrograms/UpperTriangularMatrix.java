package javaPrograms;

public class UpperTriangularMatrix {

	public static void main(String[] args) {
		UpperTriangularMatrix upper = new UpperTriangularMatrix();
		AddTwoMatrix obj = new AddTwoMatrix();
		int [][]arr1 = obj.createMultiDimensionalArray(3,3);
		System.out.println("1st Array:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j<arr1[0].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		upper.upperTriangularMatrix(arr1);
	}

	public void upperTriangularMatrix(int arr[][]) {
		int row=0, col=0;
		row=arr.length;
		col=arr[0].length;
		if(row!=col)
			System.out.println("Array should be square matrix");
		else {
			System.out.println("UpperTriangularMatrix:");
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					if(i>j) {
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
