package com.practice;

public class LinkedListTraversal {

	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListTraversal lList = new LinkedListTraversal();
		lList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		lList.head.next = second;
		second.next = third;
		
		lList.printLinkedList();

	}

	public void printLinkedList() {
		// TODO Auto-generated method stub
		Node n = head;
		while(n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
		
	}

}
