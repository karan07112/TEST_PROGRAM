package QueueUsingStack;

import java.util.Stack;

public class IntStack {

	private int stack[];
	private int top;
	private int size;
	
	public IntStack() {
		this.stack = new int[5];
		this.top = -1;
		this.size = size;
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	

	public boolean isFull(){
		return top==stack.length-1;
	}
	
	public boolean push(int value)
	{
		if(!isFull()){
			stack[++top]=value;
			return true;
		}else{
			System.out.println("Stack is Full =====>>>");
			return false;
		}
	}
	
	public int pop(){
		if(top>-1){
		return	stack[top--];
		}
		return 0;
	}
	
}
