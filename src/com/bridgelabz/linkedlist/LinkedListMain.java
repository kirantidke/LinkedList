/**
* Ability to delete the first element in the LinkedList of sequence 56->30->70
* Write pop method. Note there is new head
* Final Sequence: 30->70
*
*/
package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		Node list = new Node();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.displayData();
		list.deleteFromEnd();
		list.displayData();
	}
}
