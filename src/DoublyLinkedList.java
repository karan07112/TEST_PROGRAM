
public class DoublyLinkedList<E> {

	Node head;
	Node tail;
	int size;
	
	
	
	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
		
	}

	
	 class Node{
		
		Node prev;
		Node next;
		E data;
		public Node(E data){
			this.data=data;
		}
		
		}
	
	 
	 public int size(){
		 return size;
	 }
	 
	 public boolean isEmpty(){
		 return size==0;
	 }
	 
	 public void addFirst(E data){
		 Node node=new Node(data);
		 if(head!=null){
			 node.prev=head;
		 }
		 head=node;
		 if(tail==null){
			 tail=head;
		 }
		 
		 size++;
	 }
	 
	   public void iteratorForward() throws Exception{
		 
		 if(isEmpty()){
			 throw new Exception("Empty List");
		 }
		 
		 
		 while(head!=null){
		   System.out.println(head.data);
		  head=head.prev;
		 }
		 
	 }
	 
	 
	
	public static void main(String args[]){
		
		System.out.println("Doubly Linked List");
		
		DoublyLinkedList<Integer> list=new DoublyLinkedList<Integer>();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		
		
		try {
			list.iteratorForward();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
