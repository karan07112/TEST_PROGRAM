import java.util.Scanner;


public class ExceptionHandling {

	public ExceptionHandling() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String args[]){
		
		
		 int a, b, result = 0;
		 
		  Scanner input = new Scanner(System.in);
		  System.out.println("Input two integers");
		 
		  a = input.nextInt();
		  b = input.nextInt();
		 
		  try{
		  result = a / b;
		  }catch(Exception e){
			  
			  System.out.println("except"+e);
			  
		  }
		  System.out.println("Result = " + result);
		System.out.println("this is demo ");
	}

}
