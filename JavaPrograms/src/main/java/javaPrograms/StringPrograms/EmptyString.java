package javaPrograms.StringPrograms;

public class EmptyString {

	public static void main(String[] args) {
		String var = "A";
		if(var.length()==0)
			System.out.println("String var is empty");
		else
			System.out.println("String var is not empty");
		
		
		if(var.isEmpty())
			System.out.println("String var is empty");
		else
			System.out.println("String var is not empty");
	}

}
