package QueueUsingStack;

public class Test {

	int[] a;
	
	public Test() {
		// TODO Auto-generated constructor stub
		this.a=new int[50];
	}

	
	
	public static void main(String args[]){
		
		//a.length;
		
		
		
		IntStack stack=new IntStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
	    System.out.println(	stack.pop());
	    System.out.println(	stack.pop());
	    System.out.println(	stack.pop());
	    System.out.println(	stack.pop());
	    stack.push(10);
	    System.out.println(	stack.pop());
	    System.out.println(	stack.pop());
	    System.out.println(	stack.pop());
	    System.out.println(	stack.pop());
	    System.out.println(	stack.pop());
		
		System.out.println(stack.isFull());
	    System.out.println(stack.isEmpty());
		
	}
	
}
