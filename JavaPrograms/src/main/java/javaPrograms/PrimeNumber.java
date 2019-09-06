package javaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber pm = new PrimeNumber();
		System.out.println(pm.isPrimeNumber(22));
		System.out.println(pm.isPrimeNumber(7));
		System.out.println(pm.isPrimeNumber(1));
		System.out.println(pm.isPrimeNumber(-7));
	}
	
	public boolean isPrimeNumber(int number)
	{
		boolean flag = false;
		int count = 0;
		if(number==0 | number==1) {
			flag = false;
		}else {
			for(int i=1; i<=number; i++) {
				if(number%i == 0)
					count++;
			}
			if(count>2)
				flag=false;
			else
				flag=true;
		}
		return flag;
		
	}

}
