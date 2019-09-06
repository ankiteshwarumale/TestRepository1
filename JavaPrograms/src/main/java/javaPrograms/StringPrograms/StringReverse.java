package javaPrograms.StringPrograms;

public class StringReverse {

	public static void main(String[] args) {
		String var = "Hello World!";
		String reverse = "";
		for(int i=var.length()-1; i>=0; i--) {
			reverse = reverse + var.charAt(i);
		}
		
		System.out.println("Reverse String: "+reverse);
		
		StringBuffer var1 = new StringBuffer("This is Ankit");
		var1.reverse();
		System.out.println("String after reverse: "+var1);
	}

}
