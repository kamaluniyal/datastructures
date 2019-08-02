package linkedList;

public class LinkedList {	
	
	Node head ;
	
	static class Node{
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
	
	private void push(int value) {
		Node tmp_node = new Node(value);
		tmp_node.next=head;
		head=tmp_node;
	}
	
	private void append(int value) {
		if (head == null) 
        { 
            head = new Node(value); 
            return; 
        }
		
		Node tmp_node = new Node(value);
		tmp_node.next=null;
		Node last =head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=tmp_node;
	}
	
	private void addAfter(Node prev_node,int value) {
		
		if(prev_node==null) {System.out.println("Given node does not exist");}
		
		Node tmp_node = new Node(value);		
		tmp_node.next=prev_node.next;
		prev_node.next=tmp_node;
		
	}
	
	private void deleteNodeByValue(int value) {
		
		Node temp = head , prev = null;
		
		if(temp.data==value) {
			head=temp.next;
			return ;
		}
		
		while(temp.data!=value) {
			prev=temp;
			temp=temp.next;
		}
		
		if(temp==null) {return ;} // value not found in ll....dead code
		prev.next=temp.next;
		
		
	}
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		//ll.head=new Node(10);
		Node first = new Node(10);
		Node second = new Node(20); 
        Node third  = new Node(25);
        ll.head=first;              
        
       first.next=second;
       second.next=third;
       
       System.out.println("Original list::\n");
       ll.print();       
       ll.push(5);
       ll.append(30);
       System.out.println("after push and append ::\n");
       ll.print(); 
       ll.addAfter(first,15);
       System.out.println("after adding node in between ::\n");
       ll.print();       
       ll.deleteNodeByValue(15);
       System.out.println("after delete node ::\n");
       ll.print();
       ll.addAfter(first,15);
       System.out.println("Again add node back to same position ::\n");
       ll.print();
       
    }
	
    

}
