package javaPrograms;

public class SparseMatrix {
	
	/*To check whether the given matrix is the sparse matrix or not, 
	 * we first count the number of zero elements present in the matrix. 
	 * Then calculate the size of the matrix. For the matrix to be sparse, 
	 * count of zero elements present in an array must be greater than size/2.*/

	public static void main(String[] args) {
		SparseMatrix sparse = new SparseMatrix();
		AddTwoMatrix obj = new AddTwoMatrix();
		int [][]arr1 = obj.createMultiDimensionalArray(3,2);
		System.out.println("1st Array:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j<arr1[0].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		sparse.isSparseMatrix(arr1);
	}
	
	public void isSparseMatrix(int arr[][]) {
		int sizeOfMatrix = arr.length * arr[0].length;
		int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==0)
					count++;
			}
		}
		if(count > sizeOfMatrix/2) {
			System.out.println("Matrix is a sparse matrix");
		}
		else {
			System.out.println("Matrix is a not sparse matrix");
		}
	}

}
