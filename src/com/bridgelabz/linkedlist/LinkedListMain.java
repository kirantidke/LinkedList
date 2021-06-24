/**
* Ability to delete the last element in the LinkedList of sequence 56->30->70
* Write pop method. Note there is new head
* Final Sequence: 56->30
*
*/
package com.bridgelabz.linkedlist;

import java.util.Scanner;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedListOperations operations = new LinkedListOperations();

		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		boolean flag = true;
		while (flag) {
			int option = inputMenu();
			switch (option) {
			case 1:
				operations.addNodeInBeginnig(firstNode);
				flag = true;
				break;
			case 2:
				operations.addNodeAtEnd(thirdNode);
				flag = true;
				break;
			case 3:
				operations.addNodeInMiddle(secondNode);
				flag = true;
				break;
			case 4:
				operations.deleteNodeFromBeginning();
				flag = true;
				break;
			case 5:
				operations.deleteNodeFromLast();
				flag = true;
				break;
			case 6:
				operations.displayNode();
				flag = true;
				break;
			case 7:
				operations.searchElement();
				flag = true;
				break;
			case 8:
				flag = false;
				break;
			}
		}
	}

	public static int inputMenu() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter options to perform operations in Linked List");
		System.out.println("Press 1 to Add Node in the Beginning");
		System.out.println("Press 2 to Add Node at the End");
		System.out.println("Press 3 to Add Node in the Middle");
		System.out.println("Press 4 to Delete Node from the Beginning");
		System.out.println("Press 5 to Delete Node from the End");
		System.out.println("Press 6 to Display the Linked List");
		System.out.println("Press 7 to Search Node in the Linked List");
		System.out.println("Press 8 to Quit");

		int value = input.nextInt();

		return value;
	}
}
