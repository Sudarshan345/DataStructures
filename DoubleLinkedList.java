package com.nodesAndLinkedLists;

public class DoubleLinkedList {
	Nodes head = null;
	Nodes current = null;

	void add(int data) {
		Nodes n = new Nodes();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
		} else {
			n.previous = current;
			current.next = n;
			current = n;
		}
	}
	
	void display() {
		Nodes n=new Nodes();
		n=head;
		System.out.println("Node Elements forward order:");
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	void displayReverseOrder() {
		Nodes n=new Nodes();
		n=current;
		System.out.println("Node Elements Reverse order:");
		while(n!=null) {
			System.out.println(n.data);
			n=n.previous;
		}
	}
	
	void remove() {
		if(current!=head) {
		current=current.previous;
		current.next=null;
		} else {
			head.data=0;
		}
		
	}

}

class Nodes {
	int data;
	Nodes previous;
	Nodes next;

}