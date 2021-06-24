/**
* Ability to delete the first element in the LinkedList of sequence 56->30->70
* Write pop method. Note there is new head
* Final Sequence: 30->70
*
*/
package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedListOperations operations = new LinkedListOperations();

		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);

		operations.addNodeInBeginnig(firstNode);
		operations.addNodeAtEnd(thirdNode);
		operations.addNodeInMiddle(secondNode);
		operations.displayNode();

		operations.deleteNodeFromBeginning();
		operations.displayNode();
	}
}