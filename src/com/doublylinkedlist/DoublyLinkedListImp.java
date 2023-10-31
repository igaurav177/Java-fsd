package com.doublylinkedlist;
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    DoublyLinkedList() {
        head = null;
        tail = null;
    }

    // Insert a new node at the end of the doubly linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Traverse the doubly linked list in the forward direction
    public void traverseForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Traverse the doubly linked list in the backward direction
    public void traverseBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}

public class DoublyLinkedListImp {

	public static void main(String[] args) {
		 DoublyLinkedList list = new DoublyLinkedList();

	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);

	        System.out.println("Doubly Linked List (Forward): ");
	        list.traverseForward();

	        System.out.println("Doubly Linked List (Backward): ");
	        list.traverseBackward();

	}

}
