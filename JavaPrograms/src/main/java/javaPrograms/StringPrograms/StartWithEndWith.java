package javaPrograms.StringPrograms;

public class StartWithEndWith {

	public static void main(String[] args) {
		String var = "www.google.com";
		if(var.startsWith("ww1")) {
			System.out.println("String starts with ww");
		}else {
			System.out.println("String doesn't starts with ww");
		}
		
		if(var.startsWith("goo",4)) {
			System.out.println("String starts with goo");
		}else {
			System.out.println("String doesn't starts with ww");
		}
		
		if(var.endsWith("om")) {
			System.out.println("String ends with om");
		}
		else {
			System.out.println("String doesn't ends with om");
		}
	}

}
