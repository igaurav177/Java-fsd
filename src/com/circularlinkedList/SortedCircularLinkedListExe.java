package com.circularlinkedList;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortedCircularLinkedList {
    Node head;

    SortedCircularLinkedList() {
        head = null;
    }

    // Insert a new element into the sorted circular linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode; // Circular reference to itself
            head = newNode;
        } else if (data <= head.data) {
            // If the new element is smaller or equal to the head, insert at the beginning
            newNode.next = head.next;
            head.next = newNode;
        } else {
            Node current = head;
            while (current.next != head && current.next.data < data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Display the elements in the sorted circular linked list
    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println(" (head)");
    }
}
public class SortedCircularLinkedListExe {

	public static void main(String[] args) {
		   SortedCircularLinkedList list = new SortedCircularLinkedList();

	        list.insert(3);
	        list.insert(1);
	        list.insert(4);
	        list.insert(2);

	        System.out.println("Sorted Circular Linked List: ");
	        list.display();

	}

}
