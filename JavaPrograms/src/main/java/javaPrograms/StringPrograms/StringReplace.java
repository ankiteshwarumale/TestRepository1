package javaPrograms.StringPrograms;

public class StringReplace {

	public static void main(String[] args) {
		String var1 = "This is 1st String var1"; 
		String var2 = "This is 2nd String var2";
		System.out.println("Before:");
		System.out.println("String1: "+var1);
		System.out.println("String2: "+var2);
		
		var1 = var1.replace("String", "Replace");
		System.out.println("After1:");
		System.out.println("String1: "+var1);
		System.out.println("Replaceall: "+var1.replaceAll("i", "-"));
		var1 = var1.replace(var1, var2);
		System.out.println("After2:");
		System.out.println("String1: "+var1);
		System.out.println("String2: "+var2);
	}

}
