package day25;

/*
Q7. Longest Palindromic Substring

Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).
 */

public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaabaaa";
		System.out.println(longestPalindrome(str));
	}
	public static String longestPalindrome(String A) {
        String ans="";
        for(int i=0;i<A.length();i++){
            String s = palindrome(A,i,i);
            if(ans.length()<s.length()){
                ans = s;
            }
        }
        for(int i=0;i<A.length()-1;i++){
            String s = palindrome(A,i,i+1);
            if(ans.length()<s.length()){
                ans = s;
            }
        }
        return ans;
    }
    public static String palindrome(String s,int i,int j){
        while(i>=0 && j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                i--;
                j++;
            }else break;
        }
        return s.substring(i+1,j);
    }
}
