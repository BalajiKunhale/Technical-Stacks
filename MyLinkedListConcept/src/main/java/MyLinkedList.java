
public class MyLinkedList {	
	Node  head;
	
	class Node {                                                                                                                                                                                   
	    int data;     
		Node next; 
		               
		Node(int data) {            //    <<----- Constructor 
			this.data= data;
			next = null;			
	    }
     }	
	public void printMyLinkedList() {
		Node n =  head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;      // after printing n  move poniter to next  
		}
	}		
	public static void main(String[] args) {
		   
		MyLinkedList LL = new MyLinkedList(); 
		
		Node first = LL.new Node(10);
		LL.head =first;
		
		Node second = LL.new Node(20);
		first.next = second;
		
		Node third = LL.new Node(30);
		second.next = third;
		
		 LL.printMyLinkedList();		
	}
}
