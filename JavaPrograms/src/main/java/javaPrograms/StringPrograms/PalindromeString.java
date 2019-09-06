package javaPrograms.StringPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "Madam";
		//String temp = str;
		StringBuilder sb = new StringBuilder(str);
		String reverse = sb.reverse().toString();
		System.out.println(str.equalsIgnoreCase(reverse));
		
		String rev1="";
		//StringBuffer sb1 = new StringBuffer();
		for(int i=str.length()-1; i>=0; i--) {
			rev1= rev1 +str.charAt(i);
		}
		System.out.println("rev1: "+rev1);
		System.out.println(str.equalsIgnoreCase(rev1));
	}

}
