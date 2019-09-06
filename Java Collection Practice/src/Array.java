
public class Array {

	public static void main(String[] args) {
		//Java Program to illustrate how to declare, instantiate, initialize  
		//and traverse the Java array. 
		
		Array a = new Array();
		
		//int[] arr1 = new int[5];
		//int []arr1 = new int[5];
		int arr1[] = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[4] = 1;
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]+" ");
		}
		
		
		a.minValueInArray(arr1);
	}
	
	void minValueInArray(int array[]) {
		int min = array[0];
		for(int i=1; i<array.length; i++ ) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		System.out.println("Min: "+min);
	}

}
