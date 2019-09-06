package javaPrograms.StringPrograms;

public class SplitStringWithDot {

	public static void main(String[] args) {
		try {
			String var = "www.google.com";
			String array[] = var.split("\\.");
			for(int i=0; i<array.length; i++) {
				System.out.println(array[i]);
			}
			
			String array1[] = var.split("\\.",2);//only 2 parts
			for(int i=0; i<array1.length; i++) {
				System.out.println(array1[i]);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
