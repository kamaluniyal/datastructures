package linkedList;

public class LinkedList2 {

	public Node head ;
	
	class Node{
		int data ;
		Node next ;
		
		Node(int value){data=value;next=null;}
	}
	
	public void print() {
		
		Node n = head ;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	
}
