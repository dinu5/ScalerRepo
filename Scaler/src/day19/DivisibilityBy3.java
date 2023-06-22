package day19;

/*
Q3. Divisibility by 3

Problem Description
Given a number in the form of an array A of size N. Each of the digits of the number is represented by A[i]. Check if the number is divisible by 3.
Input Format
Given an integer array representing the number

Output Format
Return 1 if the number is divisible by 3 and return 0 otherwise.
 */

public class DivisibilityBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
        }
        if(sum%3==0) return 1;
        return 0;
    }
}
