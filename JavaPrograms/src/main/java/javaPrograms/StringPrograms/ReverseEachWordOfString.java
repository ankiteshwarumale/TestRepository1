package javaPrograms.StringPrograms;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String str  = "This is Ankiteshwar. Working in $ Sasken.";
		String[] array = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for(String text : array) {
			StringBuffer s = new StringBuffer(text);
			String rev = s.reverse().toString();
			sb.append(rev+" ");
		}
		
		System.out.println(sb);
	}

}
