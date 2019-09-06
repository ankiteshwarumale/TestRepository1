package javaPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
	
		PalindromeNumber pm = new PalindromeNumber();
		pm.isPalindromeNumber(1215);
		pm.isPalindromeNumber(1259521);
	}

	public void isPalindromeNumber(int number) {
		int rem = 0, testNumber = number, sum=0;
				
		while(number > 0) {
			rem = number%10;
			sum = (sum*10)+rem;
			number = number/10;
		}
		
		if(sum == testNumber)
			System.out.println(testNumber+" is Palindrome Number");
		else System.out.println(testNumber+" is not Palindrome Number");
	}
}
