package day25;

/*
Q5. Simple Reverse

Problem Description
Given a string A, you are asked to reverse the string and return the reversed string.
 */

public class SimpleReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "scaler";
		System.out.println(solve(str));
	}
	public static String solve(String A) {
        StringBuilder sb=new StringBuilder(A);
        return sb.reverse().toString();
    }
}
