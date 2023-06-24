package day25;

/*
Q6. Reverse the String

Problem Description
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
 */

public class ReverseTheStringByWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "the sky is blue";
		System.out.println(solve(str));
	}
	public static String solve(String A) {
        String ans="";
        int start = A.length()-1;
        while(start>=0){
            
            
            while(start>=0 && A.charAt(start)==' ') start--;
            int end = start;
            while(start>=0 && A.charAt(start)!=' ') start--;
            
            if(ans.isEmpty()){
                ans = ans+A.substring(start+1,end+1);
            }else{
                if(!A.substring(start+1,end+1).isEmpty()){
                    ans = ans+" " +A.substring(start+1,end+1);
                }
            }
        }
        return ans;
    }
}
