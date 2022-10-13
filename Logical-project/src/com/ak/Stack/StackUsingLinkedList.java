package com.ak.Stack;
import java.util.Scanner;
class Node{
	int data;
	Node next;
	public static Node getNode(int data){
		Node node=new Node();
		node.data=data;
		return node;
	}
}
class LinkedList{
	Node start;

	public void addFirst(int data){
		Node nw=Node.getNode(data);
		if(start==null)
			start=nw;
		else{
			nw.next=start;
			start=nw;
		}
	}
	public int removeFirst(){
		Node temp=null;
		if(start==null)
			System.out.println("Stack is empty");
		else{
			temp=start;
			start=start.next;
			temp.next=null;
		}
		return temp.data;
	}
	public int getFirst(){
		if(start==null)
			System.out.println("Stack is empty");
		return start.data;
	}
	public void showList(){
		Node temp=start;
		while(temp!=null){
			System.out.print(temp.data);
			temp=temp.next;
			if(temp!=null)
				System.out.print("-->");
		}
		System.out.println();
	}		
}

class StackUsingLinkedList 
{
	LinkedList stack;
	
	
	StackUsingLinkedList(){
		
		stack=new LinkedList();
	}

	void push(int item){
		stack.addFirst(item);
	}
	public int pop(){
		int poppedItem=stack.removeFirst();
		return poppedItem;
	}
	public int peek(){
		int first=stack.getFirst();
		return first;
	}
	public void display(){
		stack.showList();
	}
	public boolean	empty(){
		if(stack.start==null)
			return true;
		return false;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int choice;
		StackUsingLinkedList st=new StackUsingLinkedList();
	do{
		System.out.println("M E N U");
		System.out.println("1: push");
		System.out.println("2: pop");
		System.out.println("3: peek");
		System.out.println("4: display");
		System.out.println("5: exit");
		System.out.println("accept your choice");
		choice=sc.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("accept a value");
				int item=sc.nextInt();
				st.push(item);
				break;
			case 2:
				int poppedItem=st.pop();
				System.out.println("removed item:"+poppedItem);
				break;
			case 3:
				int topItem=st.peek();
				System.out.println("peeked item:"+topItem);
				break;
			case 4:
				st.display();
				break;
			case 5:
				System.out.println("about to exit ");
		}
	}while(choice<6);
	}
}
