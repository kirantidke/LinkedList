package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedListOperations operations = new LinkedListOperations();
		
		Node<Integer> firstNode = new Node<>(56);
	    Node<Integer> secondNode = new Node<>(30);
	    Node<Integer> thirdNode = new Node<>(70);

	    operations.addNode(firstNode);
	    operations.addNode(thirdNode);
	    
	    operations.addNodeInMiddle(secondNode);
	    
	    operations.displayNode();
	  }
}