package ExceptionHandling;

public class ExceptionHandling {

	public ExceptionHandling() {
		// TODO Auto-generated constructor stub
	}

	
	
	public static void main(String args[])
	{
		

		try {
			testExcetionThrows();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("code is running");
			
			Runtime.getRuntime().halt(1);
		}finally{
			
		System.out.println("in finally");
		
		}
		
	
	}
	
	
	public static void testExcetionThrows() throws  Exception  {
		
		
		  int i=20;
		  int j=i/0;
		  throw new Exception();
		
	}
}
