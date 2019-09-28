package DefaultAndStaticMInterface;

public class MyClass implements Interface1 , Interface2 {


	
	
	
	public static void main(String args[]){
		
		System.out.println("::main::");
		
	    new MyClass().method1();
	    Interface1.log();
	    
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

}
