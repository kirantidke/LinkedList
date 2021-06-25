package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		Node list = new Node();
		list.addNode(56);
		list.addNode(30);
		list.addNode(70);
		list.displayData();
		//list.searchNode(30);
		System.out.println("after adding 40 after 30");
		list.insertNth(40, 2);
		list.displayData();
		//list.deleteNode(2);
		//list.displayData();
		System.out.println("after sorting");
		list.sortList();
		list.displayData();
		
	}
}