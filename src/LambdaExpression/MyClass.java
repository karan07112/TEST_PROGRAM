package LambdaExpression;

public class MyClass implements Interface1 ,  Runnable  {


	
	public static void main(String args[]){
		
		
		
	//	Interface1 i1=(s)-> System.out.println(s);
			
		
	//	i1.method1("this is demo");
		
	    
		MyClass t1=new MyClass();
		
		Thread c=new Thread(t1);
		
		Runnable runnn= ()-> System.out.println("inside run method");

	}
	
	
	

	@Override
	public void method1(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		System.err.println("inside run method");
	}

	
	
	
	
}
