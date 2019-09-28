import java.util.*;


public class TestClass   {

	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}




	private String name;
	public TestClass() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public TestClass(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	static int i;
	
	
	Object obj=new Object();
	
	
	public static void main(String args[]){
		
		
		String s=new String();
		
		ArrayList<Integer>  list=new ArrayList<Integer>();
		
		try{
			
			
			
			
		}catch(OutOfMemoryError e){
			
		}
		
		int j=10000;
		for(int i=0;i<100000000;i++,j++){
			list.add(i);
			if(j==10000){
				j=0;
				Runtime.getRuntime().totalMemory();
			}
		}
		
		
		
		System.out.println(i);
		
	    System.out.println(	String.valueOf(i));
		
		TestClass obj1=new TestClass("karan"); 
		TestClass obj2=new TestClass("karan"); 
	//	System.out.println(obj1==obj2);
	//	System.out.println(obj1.equals(obj2));
		
		
		
		
		
	}

}
