package com.bridgelabz.linkedlist;

public class LinkedListOperations {
	private INode head;

    public INode addNode(INode node) {
        if (head == null)
            head = node;
        else {
            INode temp = head;
            head = node;
            head.setNext(temp);
        }
        return head;
    }
    public void displayNode(INode head) {
        System.out.println(head.getKey());
    }

}
