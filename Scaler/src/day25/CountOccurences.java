package day25;

/*
Q5. Count Occurrences

Problem Description
Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
 */

public class CountOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bobob";
		System.out.println(solve(str));
	}
	public static int solve(String A) {
        int count=0;
        for(int i=0;i<=A.length()-3;i++){
            if(A.substring(i,i+3).equals("bob")) count++;
        }
        return count;
    }
}
