package com.nodesAndLinkedLists;

public class MainDoubleLinkedList {

	public static void main(String[] args) {
		DoubleLinkedList d=new DoubleLinkedList();
		d.add(10);
		d.add(20);
		d.add(30);
		d.display();
		d.displayReverseOrder();
		d.remove();d.display();
		d.remove();d.display();
		d.remove();d.display();

 
	}

}
