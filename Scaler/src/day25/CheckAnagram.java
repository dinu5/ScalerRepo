package day25;

/*
Q6. Check anagrams

Problem Description
You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.

Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.
 */

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "cat";
		String str2 = "bat";
		System.out.println(solve(str1,str2));
	}
	public static int solve(String A, String B) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<A.length();i++){
            arr1[A.charAt(i)-'a']=arr1[A.charAt(i)-'a']+1;
            arr2[B.charAt(i)-'a']=arr2[B.charAt(i)-'a']+1;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return 0;
        }
        return 1;
    }
}
