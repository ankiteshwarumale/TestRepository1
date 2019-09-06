package javaPrograms.StringPrograms;

public class StringLength {

	public static void main(String[] args) {

		String var = "Ankit Umale";
		int length = var.length();
		System.out.println("Length of string: "+length);
		length=0;
		char[] array = var.toCharArray();
		for(int i=0; i<array.length; i++) {
			length++;
		}
		System.out.println("Length of string: "+length);
	}

}
