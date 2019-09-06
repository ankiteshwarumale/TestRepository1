package javaPrograms.StringPrograms;

public class NoOfWordsInString {

	public static void main(String[] args) {
		String str = "This is Ankit & living in Kandanchavadi. %";
		String array[] = str.split(" ");
		int count=0;
		for(String text:array) {
			count++;
		}
		System.out.println("Cont of words: "+count);
	}

}
