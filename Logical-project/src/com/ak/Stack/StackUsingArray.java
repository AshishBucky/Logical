package com.ak.Stack;

import java.util.Scanner;

public class StackUsingArray 
{
	int[] stack;
	int maxsize;
	int top;
	
	StackUsingArray(int maxsize){
		this.maxsize=maxsize;
		stack=new int[maxsize];
		top=-1;
	}

	void push(int item){
		if(top==maxsize-1)
			System.out.println("stack Overflow !!");
		else{
			top++;
			stack[top]=item;
		}
	}
	public int pop(){
		if(top==-1){
			System.out.println("stack underflow !!");
			return -1;
		}
		else{
			int poppedItem=stack[top];
			top--;
			return poppedItem;
		}
	}
	public int peek(){
		if(top==-1){
			System.out.println("stack underflow !!");
			return -1;
		}
		else{
			int topItem=stack[top];
			return topItem;
		}
	}
	public void display(){
		int temp=top;
		while(temp!=-1){
			System.out.println(stack[temp]);
			temp--;
		}
	}
	public boolean	 empty(){
		if(top==0)
			return true;
		return false;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int choice;
		StackUsingArray st=new StackUsingArray(10);
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
				System.out.println("removed item:"+topItem);
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
