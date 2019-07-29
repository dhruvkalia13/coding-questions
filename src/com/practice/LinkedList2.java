package com.practice;

public class LinkedList2 {

//	MiddleElementInOnePass
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
		
	}
	
	public static void main(String[] args) {
		LinkedList2 lList = new LinkedList2();
		lList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);
		
		lList.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = six;
		six.next = seven;
		
		Node mid = lList.middleElement(lList);

		System.out.println("Middle ele is " + mid.data);
	}

	public Node middleElement(LinkedList2 lList) {
		// TODO Auto-generated method stub
		Node slow = head;
		Node fast = head;
		while(fast != null) {
			
			
			Node nNext = fast.next;
			if(nNext != null) {
				fast = nNext.next;
				slow = slow.next;
			} else {
				break;
			}
		}
		return slow;
	}
} 
