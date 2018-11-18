package datastructure_insertnodelinkedlist;

public class Node {
	private Node head;
	private Node next;
	private int data;

	Node(int d) {
		data = d;
		next = null;
	}

	public Node() {
	}

	public void sortedInsert(Node new_node) {
		Node current;
		if (head == null || head.data >= new_node.data) {
			new_node.next = head;
			head = new_node;
		} else {
			current = head;
			while (current.next != null && current.next.data < new_node.data)
				current = current.next;
		    	new_node.next = current.next;
			    current.next = new_node;
		}
	}

	Node newNode(int data) 
    { 
       Node x = new Node(data); 
       return x; 
    } 
  
     void printList() 
     { 
         Node temp = head; 
         while (temp != null) 
         { 
            System.out.print(temp.data+" "); 
            temp = temp.next; 
         } 
     } 
     
     public static void main(String args[]) 
     { 
         Node llist = new Node(); 
         Node new_node; 
         new_node = llist.newNode(5); 
         llist.sortedInsert(new_node); 
         new_node = llist.newNode(10); 
         llist.sortedInsert(new_node); 
         new_node = llist.newNode(7); 
         llist.sortedInsert(new_node); 
         new_node = llist.newNode(3); 
         llist.sortedInsert(new_node); 
         new_node = llist.newNode(1); 
         llist.sortedInsert(new_node); 
         new_node = llist.newNode(9); 
         llist.sortedInsert(new_node); 
         System.out.println("Created Linked List"); 
         llist.printList(); 
     } 
}
