package PrimeNumber;

public class PrimeNumber {

	public PrimeNumber() {
		// TODO Auto-generated constructor stub
	}

	private static void checkPrimeNumber(int n) {

		int flag = 0;

		if (n <= 1) {
			System.out.println("check prime number");
		} else {

			for (int i = 2; i < n; i++) {

				if (n % i == 0) {

					flag = 1;

				}

			}

			if (flag == 1) {

				System.out.println("prime not number");
			} else {
				System.out.println("prime number");
			}

		}
	}
	
	private static void palimdrome(int n) {
         
		
		int r,tmp,s = 0;
		 tmp=n;
		 while(n>0){
			 r=n%10;
			 s=s*10+r;
			 n=n/10;
		 }
		
	
		 
	
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		checkPrimeNumber(6);
		palimdrome(23);

	}

}
