import java.util.Scanner;

public class testttt {

	public testttt() {
		// TODO Auto-generated constructor stub
	}

	
	static int number=1;
	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
	/*	while(sc.hasNext()){
			String var=sc.next();
			getCharCount(var);
		}*/
		while(sc.hasNextInt()){
			int var=sc.nextInt();
			//getfactorial(var);
			armstrongnumber(var);
		}
		
		
	}
	
	public static void getCharCount(String var){
		for (int i = 0; i < var.length(); i++) {
			int count = 1;
			for (int j = 0; j < var.length(); j++) {
				if (var.charAt(i) == var.charAt(j) && i != j) {
					count++;
				}
			}
			System.out.println("Count for Char " + var.charAt(i) + "  is " + count);

		}
	}
	
	public static void getfactorial(int val){
		number=1;
		         while(val>0){
		          number=number*val;
		             System.out.println(number);
		             val--;
		          }
	             
	System.out.println("factorial of "+val+" number is " + number);
	}

	
	public static void armstrongnumber(int val){
		        number=0;
		        int a,b = 0;
		        
		        while(val>0){
		        	  a=val%10;
			            val=val/10;
			            number=number+(a*a*a);  
		         
		        }
		             
	System.out.println("armstrong of "+val+" number is " + number);
	}
}
