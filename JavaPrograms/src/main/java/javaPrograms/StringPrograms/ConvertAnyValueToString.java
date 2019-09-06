package javaPrograms.StringPrograms;

public class ConvertAnyValueToString {

	public static void main(String[] args) {
		int intVal = 25;
		float floatVal = 25.75f;
		double doubleVal = 2354.76d;
		boolean booleanVal = false;
		
		System.out.println("Any type to string:");
		System.out.println(String.valueOf(intVal)+" OR "+ Integer.toString(intVal));
		System.out.println(String.valueOf(floatVal));
		System.out.println(String.valueOf(doubleVal));
		System.out.println(String.valueOf(booleanVal));
		
		System.out.println("String to any type:");
		System.out.println(Integer.parseInt(String.valueOf(intVal))+" OR "+ Integer.parseInt(Integer.toString(intVal)));
		System.out.println(Float.parseFloat(String.valueOf(floatVal)));
		System.out.println(Double.parseDouble(String.valueOf(doubleVal)));
		System.out.println(Boolean.parseBoolean(String.valueOf(booleanVal)));
	}

}
