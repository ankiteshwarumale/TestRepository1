package javaPrograms;

public class IdentityMatrix {

	public static void main(String[] args) {
		IdentityMatrix identity = new IdentityMatrix();
		AddTwoMatrix obj = new AddTwoMatrix();
		int [][]arr1 = obj.createMultiDimensionalArray(3,2);
		System.out.println("1st Array:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j<arr1[0].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(identity.isIdentityMatrix(arr1));
	}

	public boolean isIdentityMatrix(int arr[][]) {
		boolean flag = true;
		if(arr.length != arr[0].length) {
			System.out.println("Array should be square matrix");
			flag= false;
		}
		else {
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					if(i==j && arr[i][j]!=1) {
						flag=false;
						break;
					}
					if(i!=j && arr[i][j]!=0) {
						flag=false;
						break;
					}
				}
				
			}
			if(flag) {
				System.out.println("Given matrix is an identity matrix");
			}
			else {
				System.out.println("Given matrix is not an identity matrix");
			}
			
		}
		return flag;
		
	}
}
