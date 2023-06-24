package day25;

import java.util.Arrays;

/*
Q4. Change character

Problem Description
You are given a string A of size N consisting of lowercase alphabets.

You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.

Find the minimum number of distinct characters in the resulting string.
 */

public class ChangeCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabbccd";
		System.out.println(solve(str,3));
	}
	public static int solve(String A, int B) {
        if(A.length()<=1) return A.length();
        int[] arr=new int[26];
        int totalDistinct = 0;
        for(int i=0;i<A.length();i++){
            int index = A.charAt(i) - 'a';
            if(arr[index]==0) totalDistinct++;
            arr[index] = arr[index]+1;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(arr[i]<=B){
                    totalDistinct-=1;
                    B = B - arr[i];
                }
            }
        }
        return totalDistinct;
    }
}
