package javaPrograms;

public class MultiplyTwoMatrix {

	public static void main(String[] args) {
		MultiplyTwoMatrix mul = new MultiplyTwoMatrix();
		AddTwoMatrix obj = new AddTwoMatrix();
		int [][]arr1 = obj.createMultiDimensionalArray(3,2);
		System.out.println("1st Array:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j<arr1[0].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		int [][]arr2 = obj.createMultiDimensionalArray(2,3);
		System.out.println("2nd Array:");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0; j<arr2[0].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		int result[][] = mul.multiplyMultiDimensionalArray(arr1, arr2);
		System.out.println("Multiply Result:");
		for(int i=0;i<result.length;i++) {
			for(int j=0; j<result[0].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public int[][] multiplyMultiDimensionalArray(int arr1[][], int arr2[][]){
		int result[][] = new int[arr1.length][arr2[0].length];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				result[i][j]=0;
				for(int k=0; k<arr1.length; k++) {
					result[i][j] = result[i][j] + (arr1[i][k]*arr2[k][i]);
				}
			}
		}
		
		return result;
		
	}

}
