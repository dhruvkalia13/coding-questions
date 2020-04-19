package com.practice;

public class LinkedList3 {
	
//	CheckIfLinkedListContainsLoop
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		LinkedList3 lList = new LinkedList3();
		lList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		lList.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = lList.head;
		fifth.next = third;
		
		if(lList.checkIfLinkedListCircular(lList)) {
			System.out.println("Yes, it is circular");
		} else {
			System.out.println("No, it is not circular");
		}
	}
	public boolean checkIfLinkedListCircular(LinkedList3 lList) {
		// TODO Auto-generated method stub
		Node slow = head;
		Node fast = head;
		boolean circular = false;
		while(slow != null || fast != null) {
			
			Node nNext = fast.next;
			if(nNext != null) {
				fast = nNext.next;	
				slow = slow.next;
			} else {
				break;
			}
			
			if(slow.next == fast.next) {
				circular = true;
				break;
			}
		}
		return circular;
	}

}
