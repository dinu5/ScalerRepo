package day28;

/*
Q1. Print reverse string

Problem Description
Write a recursive function that takes a string, S, 
as input and prints the characters of S in reverse order.
 */

public class PrintReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Dinu";
		System.out.println(helper(str,0,""));

	}
	public static String helper(String s,int i,String curr) {
		if(i==s.length()) return curr;
		curr = helper(s,i+1,curr);
		curr = curr.concat(""+s.charAt(i));
		return curr;
	}
}
