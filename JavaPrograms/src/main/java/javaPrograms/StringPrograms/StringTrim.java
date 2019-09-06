package javaPrograms.StringPrograms;

public class StringTrim {

	public static void main(String[] args) {
		String var = "   Ankit Umale   ";
		System.out.println("Length after trim: "+var.trim().length());
		System.out.println("String after trim: "+var.trim());
		
		int startindex=0, endindex=0;
		endindex=var.length();
		while(startindex<endindex && var.charAt(startindex)==' ') {
			startindex++;
		}
		
		while(endindex>startindex && var.charAt(endindex-1)==' ') {
			endindex--;
		}
		
		String result = new String(var.substring(startindex, endindex));
		System.out.println("Length after trim: "+result.length());
		System.out.println("String after trim: "+result);
	}

}
