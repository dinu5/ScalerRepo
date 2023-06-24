package day25;

/*
Q1. Longest Common Prefix

Problem Description
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.

The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 */

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"abcdefgh", "aefghijk", "abcefgh"};
		System.out.println(longestCommonPrefix(arr));
	}
	public static String longestCommonPrefix(String[] A) {
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            minLen=Math.min(minLen,A[i].length());
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<minLen;i++){
            boolean flag=true;
            char ch = A[0].charAt(i);
            for(int j=1;j<A.length;j++){
                if(A[j].charAt(i)!=ch){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                ans.append(ch);
            }else break;
        }
        return ans.toString();
    }
}
