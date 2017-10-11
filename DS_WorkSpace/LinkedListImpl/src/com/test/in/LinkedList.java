package com.test.in;

public class LinkedList {

	Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	// printList

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	
	// Node creation

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		ll.head.next = second;
		second.next = third;
		ll.printList();
		ll.insertNode(ll.head.next, 12);
		ll.printList();
	}

	// Node insertion at head
	
	public void insertHead(){
		Node newhead = new Node(4);
		newhead.next=head;
		head = newhead;
		
	}
	
	// Add node at a given point 
	public void insertNode(Node prev_node,int d){
		Node nextNode = prev_node.next;
		Node btwNode = new Node(5);
		if(prev_node == null){
			insertHead();
		}else{

			prev_node.next = btwNode;
			btwNode.next = nextNode;
			
		}
		
		
	}
}
