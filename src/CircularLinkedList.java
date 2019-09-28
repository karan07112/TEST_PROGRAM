
public class CircularLinkedList {

	
	Node head;
	Node tail;
	int size;
	

	public CircularLinkedList() {
		// TODO Auto-generated constructor stub
	}

	
	class Node{
		Node next;
		Node prev;
		int data;
		
		Node(int data){
			this.data=data;
			prev=null;
			next=null;
		}
			
	}
	
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	
	public void addFirst(int data){
		
		Node node=new Node(data);
	 	if(head==null){
	 		node.next=node;
	 		node.prev=node;
	 		head=node;
	 		tail=head;
	 		}else{
				node.next=head;
	 			node.prev=tail;
	 			head.prev=node;
	 			tail.next=node;
	 			head=node;
	 			}
	 }
	
	public void iterateForward(){
	
	 	while(head!=null){
		   System.out.println(head.data);
		   System.out.println(head.next   );
		   System.out.println(head.prev   );
		   head=head.next;
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		  }
	 }
	
	
	
	public static void main(String args[]){
		CircularLinkedList list=new CircularLinkedList();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		System.out.println("Circular linked list");
		list.iterateForward();
	
	}
	
	
	
	
}
