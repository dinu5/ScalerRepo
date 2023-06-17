package day28;

/*
Q3. Check Palindrome

Problem Description
Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.

Note: A palindrome is a string that's the same when read forward and backward.
 */

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbbxa";
		int start = 0;
		int end = str.length()-1;
		System.out.println(isPalindrome(str,start,end));
	}
	
	public static int isPalindrome(String A,int s,int e) {
		if(A.charAt(s)!=A.charAt(e)) return 0;
		if(s>=e) return 1;
		return isPalindrome(A,s+1,e-1);
	}

}
