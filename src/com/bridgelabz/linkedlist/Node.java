package com.bridgelabz.linkedlist;

import com.bridgelabz.datastructure.stack.LinkedListMain.Node;

public class Node {
	int size;
	int data;
	Node nextNode;

	Node() {
	}

	public Node(int data) {
		this.data = data;
		this.nextNode = null;
	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.nextNode = newNode;
			tail = newNode;
		}
		size++;
	}

	public void deleteFirstElement(int data) {
		System.out.println("Deleting First element " + data + " from the list");
		if (this.head == null) {
			System.out.println("The List is empty.\n");
		}

		Node current = this.head, previous = this.head;

		if (this.head.data == data) {
			this.head = this.head.nextNode;
		}

		while (current != null && current.data != data) {
			previous = current;
			current = current.nextNode;
		}

		if (current != null) {
			previous.nextNode = current.nextNode;
		} else {
			System.out.println("The data " + data + " could not be found in the List");
		}
	}

	public void deleteFromEnd() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			if (head != tail) {
				Node current = head;

				while (current.nextNode != tail) {
					current = current.nextNode;
				}
				tail = current;
				tail.nextNode = null;
			} else {
				head = tail = null;
			}
		}
	}

	// function to insert a Node at required position

	public void insertNth(int data, int position) {
		// create new node.
		Node node = new Node();
		node.data = data;
		node.nextNode = null;

		if (this.head == null) {

			// if head is null and position is zero then exit.
			if (position != 0) {
				return;
			} else { // node set to the head.
				this.head = node;
			}
		}

		if (head != null && position == 0) {
			node.nextNode = this.head;
			this.head = node;
			return;
		}

		Node current = this.head;
		Node previous = null;

		int i = 0;

		while (i < position) {
			previous = current;
			current = current.nextNode;

			if (current == null) {
				break;
			}

			i++;
		}

		node.nextNode = current;
		previous.nextNode = node;
	}

	void deleteNode(int position) {
		// If linked list is empty
		if (head == null)
			return;

		// Store head node
		Node temp = head;

		// If head needs to be removed
		if (position == 0) {
			head = temp.nextNode; // Change head
			return;
		}

		// Find previous node of the node to be deleted
		for (int i = 0; temp != null && i < position - 1; i++)
			temp = temp.nextNode;

		// If position is more than number of nodes
		if (temp == null || temp.nextNode == null)
			return;
		Node next = temp.nextNode.nextNode;

		temp.nextNode = next; // Unlink the deleted node from list
	}

	public void sortList() {

		// Node current will point to head
		Node current = head, index = null;

		int temp;

		if (head == null) {
			return;
		} 
		else {
			while (current != null) {
				// Node index will point to node next to
				// current
				index = current.nextNode;

				while (index != null) {
					// If current node's data is greater
					// than index's node data, swap the data
					// between them
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}

					index = index.nextNode;
				}
				current = current.nextNode;
			}
		}
	}

	public void displayData() {
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
		}
		System.out.println("Nodes of singly linked list");

		while (current != null) {
			System.out.print(current.data + "->");
			current = current.nextNode;
		}
		System.out.println();
	}
}