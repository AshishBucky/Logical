package com.ak.LinkedList;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	
	public static Node getNode(int data) {
		Node node=new Node();
		node.data=data;
		return node;
	}
}

public class LinkedList {
	Node start;
	Node end;
	
	LinkedList(){
		start=end=null;
	}
	void addFirst(int data) {
		Node nw=Node.getNode(data);
		if(start==null) 
			start=end=nw;
		else {
			nw.next=start;
			start=nw;
		}
	}
	void addLast(int data) {
		Node nw=Node.getNode(data);
		if(start==null) 
			start=end=nw;
		else {
			end.next=nw;
			end=nw;
		}
	}
	void removeFirst() {
		if(start==null)
			System.out.println("List is empty !!");
		else {
			Node temp=start;
			start=start.next;
			temp.next=null;
		}
	}
	void removeLast() {
		if(start==null)
			System.out.println("List is empty !!");
		else if(start==end) {
			start=end=null;
		}
		else {
			Node temp=start;
			Node prev=null;
			while(temp.next!=null) {
				prev=temp;
				temp=temp.next;	
			}
			prev.next=null;
			end=prev;
		}	
	}
	int getFirst() {
		if(start==null)
			System.out.println("List is empty !!");
		return start.data;
	}
	int getLast() {
		if(start==null)
			System.out.println("List is empty !!");
		return end.data;
	}
	void showList() {
		Node temp=start;
		while(temp!=null) {
			int data=temp.data;
			System.out.print(data);
			temp=temp.next;
			if(temp!=null)
				System.out.print("-->");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		LinkedList list=new LinkedList();
		do {
			
			System.out.println("M E N U");
			System.out.println("1: Add First");
			System.out.println("2: Add Last");
			System.out.println("3: Remove First");
			System.out.println("4: Remove Last");
			System.out.println("5: Get First");
			System.out.println("6: Get Last");
			System.out.println("7: View List");
			System.out.println("8: Exit");
			System.out.println("Choose your option:");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("enter data :");
					int data=sc.nextInt();
					list.addFirst(data);
					break;
				case 2:
					System.out.println("enter data");
					 data=sc.nextInt();
					list.addLast(data);
					break;
				case 3:
					list.removeFirst();
					break;
				case 4:
					list.removeLast();
					break;
				case 5:
					int first=list.getFirst();
					System.out.println("first :"+first);
					break;
				case 6:
					int last=list.getLast();
					System.out.println("last :"+last);
					break;
				case 7:
					list.showList();
					break;
				case 8:
					System.out.println("about to exit");
					break;
				default:
					System.out.println("invalid option");
			}
		}
		while(choice!=5);	
	
	}
}

