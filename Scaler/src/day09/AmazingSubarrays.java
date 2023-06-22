package day09;

/*
Q3. Amazing Subarrays

You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 */

public class AmazingSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABEC";
		System.out.println(solve(str));
	}
	public static int solve(String A) {
        long x=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u' || A.charAt(i)=='A' || A.charAt(i)=='E' || A.charAt(i)=='I' || A.charAt(i)=='O' || A.charAt(i)=='U')
            {
                x+=A.length()-i;
            }
        }
        return (int)(x%10003);
    }
}
