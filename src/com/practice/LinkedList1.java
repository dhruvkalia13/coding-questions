package com.practice;

public class LinkedList1 {

	//MiddleElementInOnePass
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
		LinkedList1 lList = new LinkedList1();
		lList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		
		
		lList.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		
		Node mid = lList.findMiddleElement(lList);
		
		System.out.println("Middle ele is " + mid.data);
	}
	public Node findMiddleElement(LinkedList1 lList) {
		 
		Node ele = head;
		int count = 0;
		while(ele != null) {
			count ++;
			ele = ele.next;
		}
		System.out.println("Number of Elements is " + count);
		if(count%2 != 0) {
			count = (count/2) + 1;
		} else {
			count = count/2;
		}
		System.out.println("Middle element is at" + count + " position");
		ele = head;
		count--;
		while(count > 0) {
			ele = ele.next;
			count--;
		}
		return ele;
	}

}
