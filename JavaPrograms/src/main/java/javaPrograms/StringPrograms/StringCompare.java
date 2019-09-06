package javaPrograms.StringPrograms;

public class StringCompare {

	public static void main(String[] args) {
		
		String s2 = "Ankit Umale1";
		String s1 = "Ankit Umale";
		if(s1.compareTo(s2)==0) {
			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
		
		if(s1.compareTo(s2)==0) {
			System.out.println("Strings are equal");
		}
		else if(s1.compareTo(s2)>0)
			System.out.println("Strings s1 is big");
		else if(s1.compareTo(s2)<0)
			System.out.println("String s2 is big");
	}

}
