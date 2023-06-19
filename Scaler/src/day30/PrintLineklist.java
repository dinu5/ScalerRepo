package day30;

import java.util.LinkedList;

/*
Q1. Print Linked List

Problem Description
You are given A which is the head of a linked list. Print the linked list in space separated manner.

Note : The last node value must also be succeeded by a space and after printing the entire list you should print a new line
 */



public class PrintLineklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(12);
		list.add(30);
		list.add(8);
		solve(list);

	}
	public static void solve(LinkedList<Integer> list) {
		// But in other IDE we will be using list.next to traverse
		for(Integer item : list) {
			System.out.print(item + " ");
		}
	}
}
