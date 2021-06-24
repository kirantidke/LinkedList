package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		Node<Integer> firstNode = new Node<>(56);
	    Node<Integer> secondNode = new Node<>(30);
	    Node<Integer> thirdNode = new Node<>(70);

	        //Linking nodes
	     firstNode.setNext(secondNode);
	     secondNode.setNext(thirdNode);

	        //If linking successful, return successful
	     if(firstNode.getNext() == secondNode && secondNode.getNext() == thirdNode) {
	    	 System.out.println(firstNode.getKey() + " -> " + secondNode.getKey() + " -> " + thirdNode.getKey());
	         System.out.println("Linked List created successfully...");
	        }
	        else
	            System.out.println("Linked List creation failed...");
	}


}
