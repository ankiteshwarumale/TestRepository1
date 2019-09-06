package javaPrograms;

public class EqualMatrix {

	public static void main(String[] args) {
		EqualMatrix equal = new EqualMatrix();
		AddTwoMatrix obj = new AddTwoMatrix();
		int [][]arr1 = obj.createMultiDimensionalArray(3,2);
		System.out.println("1st Array:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j<arr1[0].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		int [][]arr2 = obj.createMultiDimensionalArray(3,2);
		System.out.println("2nd Array:");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0; j<arr2[0].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		equal.isEqualMatrix(arr1, arr2);
	}

	public void isEqualMatrix(int arr1[][], int arr2[][]) {
		boolean flag=true;
		if(arr1.length!=arr2.length) {
			System.out.println("Rows of both array should be same");
		}
		else if(arr1[0].length!=arr2[0].length) {
			System.out.println("Columns of both array should be same");
		}else {
			for(int i =0; i<arr1.length; i++) {
				for(int j=0; j<arr1[0].length; j++) {
					if(arr1[i][j]!=arr2[i][j]) {
						flag=false;
						break;
					}
				}
				if(flag == false)
					break;
			}
			if(flag) {
				System.out.println("Both Matrices are equal");
			}else {
				System.out.println("Both Matrices are not equal");
			}
		}
		
	}
}
