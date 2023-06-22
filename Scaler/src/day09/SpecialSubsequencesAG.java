package day09;

/*
Q4. Special Subsequences "AG"

Problem Description
You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 */

public class SpecialSubsequencesAG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCGAG";
		System.out.println(solve(str));
	}
	public static int solve(String A) {
        int a=0;
        long ans=0;
        
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='A') a++;
            if(A.charAt(i)=='G' && a!=0){
                ans += a;
            }
        }
        return (int)(ans%(Math.pow(10,9)+7));
    }
}
