import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class StackQueue {

	public StackQueue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {

		Stack<Integer> st = new Stack<>();

		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);

	//	System.out.println(st);
		st.pop();

	//	System.out.println(st);

		st.peek();

	//	System.out.println(st);
		
		ArrayList<String> list=new ArrayList<String>();
		
		LinkedList<String>  list2=new LinkedList<String>();
		
		
 		list.add("k");
 		list.add("a");
 		list.add("r");
 		list.add("a");
 		list.add("n");
 		
 		Iterator itr=list.iterator();
 		
 		while (itr.hasNext()) {
			Object object = (Object) itr.next();
		
			  System.out.println(object.toString());
			
			
		}
		
		

	}
}
