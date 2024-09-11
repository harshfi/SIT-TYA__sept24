package Lec_7;

public class LinkedList {
       
	public static class Node {
		int data;
		Node next;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Node nn= new Node();
		
		Node head=nn;
		
		for (int i = 0; i < 5; i++) {
			nn.data= 5*i;
			if(i!=4) {
			Node n= new Node();
			nn.next=n;
			nn=n;
			}
		}
		
		//print
		Node curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
		
		
		//insert at i=2;
		Node prev=null;
		curr=head;
		int i=0;
		
		while(i<2) {
			i++;
			prev=curr;
			curr=curr.next;
		}
		
		Node n = new Node();
		n.data=100;
		prev.next=n;
		n.next=curr;
		
		System.out.println("New LinkedList");
		print(head);
		
		//remove i=2;
		
		prev=null;
		i=0;
		curr=head;
		while(i<3) {
			i++;
			prev=curr;
			curr=curr.next;
		}
		
		prev.next=curr.next;
		curr.next=null;//optional
		System.out.println("After remove");
		 print(head);
		
		
		
	}
	
	public static void print(Node head) {
		Node curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

}
